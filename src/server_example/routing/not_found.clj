(ns server-example.routing.not-found
    (:require
        ;; Third Party
        [hiccup.page :as page]))

(defn render [args]
    (page/html5
        [:head
        [:title "404 Not Found!"]
        [:link {
            :type "text/css",
            :href "https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css",
            :rel "stylesheet"}]
        [:link {
            :type "text/css",
            :href "https://getbootstrap.com/docs/3.3/examples/starter-template/starter-template.css",
            :rel "stylesheet"}]]
        [:body
        [:div.container
            [:nav.navbar.navbar-inverse.navbar-fixed-top
                [:div.container
                [:div.navbar-header
                    [:a.navbar-brand "Clojure Server"]]
                [:div#navbar.collapse.navbar-collapse
                    [:ul.nav.navbar-nav
                        [:li
                            [:a {:href "/"} "Home"]]]]]]
            [:div.starter-template
                [:h1 "404 - Page Not Found!"]]]]))