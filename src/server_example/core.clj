(ns server-example.core
  (:require
    ;; Ours
	[server-example.routing.index :as index]
	[server-example.routing.not-found :as not-found]
	;; Third Party
    [compojure.core :refer :all] ; import * from 'path'
    [compojure.handler :as handler]
    [compojure.route :as route]
    [ring.adapter.jetty :as ring]
    [clojure.tools.logging :as log]))

(defroutes app-routes
	(GET "/" [] index/render)
	(route/not-found not-found/render))

(defn start-server []
  (ring/run-jetty (handler/site app-routes) {:port 3000}))

(defn -main []
  "Start up the web server"
  (log/info "Starting server at http://localhost:3000")
  (start-server))

