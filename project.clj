(defproject esp-common "0.1.0-SNAPSHOT"
  :description "Code common to the ESP components."
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/tools.logging "0.2.3"]
                 [org.iplantc/clojure-commons "1.4.0-SNAPSHOT"]
                 [cheshire "5.0.1"]
                 [clj-http "0.5.3"]
                 [clj-time "0.4.3"]
                 [slingshot "0.10.1"]
                 [com.cemerick/url "0.0.6"]]
  :profiles {:dev {:dependencies [[midje "1.4.0"]
                                  [lein-midje "2.0.0-SNAPSHOT"]]}}
  :plugins [[lein-ring "0.7.4"]]
  :repositories {"iplantCollaborative"
                 "http://projects.iplantcollaborative.org/archiva/repository/internal/"})
