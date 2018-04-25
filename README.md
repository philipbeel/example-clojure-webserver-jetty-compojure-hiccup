[![Build Status](https://circleci.com/gh/philipbeel/example-typescript-nyc-mocha-coverage.svg?&style=shield&circle-token=d766b5ba41f74c9d35cb0cd08d48aa321c42bc26)](https://circleci.com/gh/philipbeel/example-typescript-nyc-mocha-coverage)

# example-clojure-webserver-jetty-compojure-hiccup

Example Clojure project that implements a webserver with basic routing and templating capability using Jetty, Compojure, and Hiccup

##### Documentation
Full documentation about this project can be found at:
[Clojure webserver with Jetty, Compojure, and Hiccup](https://theodin.co.uk/)

##### Installation
Install [Leiningen](https://leiningen.org/) then checkout this project

##### How to use:

run the following command in the root of the project:
```
lein run
```
navigate to `http://localhost:3000` to see the homepage route. Navigate to an undefined route to execise 404 behaviour, e.g. `http://localhost:3000/abc`.