(ns digest.core
  (:require [digest.convert :as c])
  (:import [java.nio.charset Charset]
           [java.security MessageDigest]))

(set! *warn-on-reflection* true)

(defn md5 [& vals]
  (let [utf-8 (Charset/forName "utf-8")
        md5 (MessageDigest/getInstance "MD5")]
    (doseq [v vals]
      (.update md5 (.getBytes (str v) utf-8)))
    (c/bytes->hex (.digest md5))))
