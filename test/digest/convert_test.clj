(ns digest.convert-test
  (:require [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]
            [digest.convert :refer :all]))

(defn bytes->hex' [data]
  (let [hex (.toString (BigInteger. 1 data) 16)
        pad (apply str (repeat (- (* 2 (count data)) (count hex)) \0))]
    (str pad hex)))

(def not-empty-byte-array (gen/such-that not-empty gen/bytes))

(defspec bytes->hex-prop 10000
  (prop/for-all [b not-empty-byte-array]
    (= (bytes->hex' b) (bytes->hex b))))

(comment
  (require 'criterium.core)
  (let [b (.getBytes "Hello, World!" "utf-8")]
    (criterium.core/quick-bench (bytes->hex b)))
  )
