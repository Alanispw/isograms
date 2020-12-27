(ns isogram.core-test
  (:require [clojure.test :refer :all]
            [isogram.core :refer :all]))

(deftest test-isogram
  (testing "murcielago is an isogram "
    (is (isogram.core/isogram? "murcielago"))))

(deftest test-isogram-mayus
  (testing "MurCielaGo is an isogram "
    (is (isogram.core/isogram? "MurCielaGo"))))
