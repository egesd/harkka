(ns harkka.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[harkka started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[harkka has shut down successfully]=-"))
   :middleware identity})
