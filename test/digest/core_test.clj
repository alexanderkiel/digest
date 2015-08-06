(ns digest.core-test
  (:require [clojure.test :refer :all]
            [digest.core :refer :all]))

(deftest md5-test
  (is (= "65a8e27d8879283831b664bd8b7f0ad4" (md5 "Hello, World!"))))

(comment
  (require 'criterium.core)
  (criterium.core/bench (md5 "Hello, World!"))
  )
