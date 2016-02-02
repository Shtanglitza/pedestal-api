(defproject pedestal-api "0.1.0-SNAPSHOT"
  :description "A batteries-included API for Pedestal using Swagger"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [io.pedestal/pedestal.service "0.4.1"]
                 [potemkin "0.4.3"]
                 [frankiesardo/route-swagger "0.4.5-9-gf0fa5db-SNAPSHOT"]]
  :repl-options {:init-ns user}
  :profiles {:dev {:source-paths ["dev" "example"]
                   :dependencies [[org.clojure/tools.namespace "0.2.5"]
                                  [io.pedestal/pedestal.jetty "0.4.1"]
                                  [ch.qos.logback/logback-classic "1.1.2"
                                   :exclusions [org.slf4j/slf4j-api]]
                                  [org.slf4j/jcl-over-slf4j "1.7.7"]
                                  [org.slf4j/jul-to-slf4j "1.7.7"]
                                  [org.slf4j/log4j-over-slf4j "1.7.7"]]}})