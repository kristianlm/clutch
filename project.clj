(defproject com.ashafa/clutch "0.4.0-RC1"
  :description "A Clojure library for Apache CouchDB."
  :url "https://github.com/clojure-clutch/clutch/"
  :license {:name "BSD"
            :url "http://www.opensource.org/licenses/BSD-3-Clause"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 
                 [clj-http "0.5.5"]
                 [cheshire "4.0.0"]
                 [commons-codec "1.6"]
                 [com.cemerick/url "0.0.6"]
                 
                 [org.clojure/clojurescript "0.0-1450" :optional true
                  :exclusions [com.google.code.findbugs/jsr305
                               com.googlecode.jarjar/jarjar
                               junit
                               org.apache.ant/ant
                               org.json/json
                               org.mozilla/rhino]]]
  :profiles {:dev {}
             :1.2.0 {:dependencies [[org.clojure/clojure "1.2.0"]]}
             :1.3.0 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.5.0 {:dependencies [[org.clojure/clojure "1.5.0-alpha6"]]}}
  :aliases  {"all" ["with-profile" "dev,1.2.0:dev,1.3.0:dev:dev,1.5.0"]}
  :min-lein-version "2.0.0"
  :test-selectors {:default #(not= 'test-docid-encoding (:name %))
                   :all (constantly true)})
