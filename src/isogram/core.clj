(ns isogram.core
  (:require [clojure.string]))

(defn isogram? [w]
  [w]
  (every? #(= 1 %)
  (-> w 
      (clojure.string/lower-case)
      (frequencies)
      (vals)))
     )
