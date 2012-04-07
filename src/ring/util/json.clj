(ns ring.util.json
  (:require [cheshire.core :as json])
  (:use [ring.util.response :only (response content-type)]))

(defn json-response
  "Turn the supplied data into a JSON-encoded Ring response."
  [data & {:keys [callback]}]
  (if (nil? callback)
    (-> (response (json/generate-string data))
        (content-type "application/json"))
    (-> (response (str callback "("
                       (json/generate-string data)
                       ");"))
        (content-type "text/javascript"))))
