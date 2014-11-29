(ns typed-async-whatsit.core
  (:require [clojure.core.async :as a]
            [clojure.core.typed :as t]
            [clojure.core.typed.async :as t.a]
            [clojure.java.io :as io])
  (:import [java.net Socket]))

(t/ann ^:no-check clojure.java.io/reader
       [java.net.Socket -> java.io.Reader])
(t/ann ^:no-check clojure.java.io/writer
       [java.net.Socket -> java.io.Writer])

(t/ann connect [String Long -> '{:in (t.a/Chan String)
                                 :out (t.a/Chan String)}])
(defn connect
  [host port]
  (let [ch-in (t.a/chan :- String 100)
        ch-out (t.a/chan :- String 100)
        s (Socket. ^String host (int port))
        r (io/reader s)
        w (io/writer s)]
    (t.a/go-loop []
      (if-let [s (a/<! ch-out)]
        (do
          (binding [*out* w]
            (println s))
          (recur))
        (do
          (.close r)
          (.close w)
          (.close s))))
    (t.a/go-loop []
      (let [s (binding [*in* r] (read-line))]
        (a/>! ch-in s)
        (recur)))
    {:in ch-in, :out ch-out}))
