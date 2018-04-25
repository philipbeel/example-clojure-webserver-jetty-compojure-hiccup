(defproject server-example "1.0.0"
  :description "Example Clojure project that implements a webserver with basic routing and templating capability using Jetty, Compojure, and Hiccup"
  :url "http://theodin.co.uk"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [
    [org.clojure/clojure "1.8.0"]
    [org.clojure/tools.logging "0.4.0"]
    [ring/ring-core "1.6.3"]
    [ring/ring-jetty-adapter "1.6.3"]
    [compojure "1.4.0"]
    [hiccup "1.0.4"]]

  :main server-example.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
