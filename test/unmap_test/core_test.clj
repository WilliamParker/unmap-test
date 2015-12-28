(ns unmap-test.core-test
  (:require [clojure.test :refer :all]
            [unmap-test.core :refer :all]))

(def b a)

(deftest always-true-test
  (is true))
