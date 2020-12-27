(ns isogram.core-test
  (:require [clojure.test :refer :all]
            [isogram.core :refer :all]))

(deftest test-isogram
  (testing "murcielago is an isogram "
    (is (isogram.core/isogram? "murcielago"))))

(deftest test-isogram-mayus
  (testing "MurCielaGo is an isogram "
    (is (isogram.core/isogram? "MurCielaGo"))))

(deftest test-isogram-special-characters 
  (testing "m#urci$el#ago is an isogram "
    (is (isogram.core/isogram? "murci$el#ago"))))


(deftest test-isogram-blank-spaces
  (testing "mur cie lago is an isogram "
    (is (isogram.core/isogram? "mur cie lago"))))