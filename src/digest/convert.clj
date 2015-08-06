(ns digest.convert)

(set! *unchecked-math* true)
(set! *warn-on-reflection* true)

(def ^:private hex-chars
  (char-array "0123456789abcdef"))

(defn bytes->hex
  "Converts a byte array to a hex string."
  ([^bytes data]
  (let [^chars hex-chars hex-chars
        len (alength data)
        ^chars buffer (char-array (* 2 len))]
    (loop [i 0]
      (when (< i len)
        (let [b (long (aget data i))]
          (aset buffer (* 2 i) (aget hex-chars (bit-shift-right (bit-and b 0xF0) 4)))
          (aset buffer (inc (* 2 i)) (aget hex-chars (bit-and b 0x0F))))
        (recur (inc i))))
    (String. buffer))))
