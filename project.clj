(defproject digest "0.1-SNAPSHOT"
  :description "Simple Clojure message digest (MD5, SHA-1, ...) lib."
  :url "https://github.com/alexanderkiel/digest"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.7.0"]]

  :profiles {:dev {:dependencies [[org.clojure/test.check "0.7.0"]
                                  [criterium "0.4.3"]]}})
