(ns harkka.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [harkka.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[harkka started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[harkka has shut down successfully]=-"))
   :middleware wrap-dev})
