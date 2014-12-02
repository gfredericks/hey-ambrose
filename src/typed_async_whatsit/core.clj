(ns typed-async-whatsit.core
  (:require [clojure.core.async :as a]
            [clojure.core.typed :as t]
            [clojure.core.typed.async :as t.a]))

(t/ann connect [String Long -> '{:in (t.a/Chan String)
                                 :out (t.a/Chan String)}])
(defn connect
  [host port]
  (let [ch-in (t.a/chan :- String 100)
        ch-out (t.a/chan :- String 100)]
    (t.a/go-loop []
      (if-let [s (a/<! ch-out)]
        (do
          (println s)
          (recur))))
    (t.a/go-loop []
      (let [s "hey hey"]
        (a/>! ch-in s)
        (recur)))
    {:in ch-in, :out ch-out}))
