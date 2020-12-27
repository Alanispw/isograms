(ns isogram.core
  (:require [clojure.string]))

(defn isogram? [word]
  [word]
  (->> 
      (clojure.string/lower-case word)
      (remove #(contains? #{\space \-} %))
      (frequencies)
      (vals)
      (every? #(= 1 %))))
   