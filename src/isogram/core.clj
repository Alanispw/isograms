(ns isogram.core
  (:gen-class))

(defn isogram? [w]
  [w]
  (every? #(= 1 %)
  (-> w 
      (frequencies)
      (vals)))
     )
