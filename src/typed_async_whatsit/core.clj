(ns typed-async-whatsit.core
  (:require [clojure.core.async :as a]
            [clojure.core.typed :as t]
            [clojure.core.typed.async :as t.a]))

(t/ann connect [-> nil])
(defn connect
  []
  (let [ch (t.a/chan :- String 100)]
    (t.a/go-loop []
      (a/>! ch "hey hey"))
    nil))
