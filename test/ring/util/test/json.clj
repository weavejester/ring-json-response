(ns ring.util.test.json
  (:use ring.util.json
        clojure.test))

(deftest json-response-test
  (let [resp (json-response {:foo "bar"})]
    (is (= (get-in resp [:headers "Content-Type"]) "application/json"))
    (is (= (resp :body) "{\"foo\":\"bar\"}"))))

(deftest jsonp-response-test
  (let [resp (json-response {:foo "bar"} :callback "callback")]
    (is (= (get-in resp [:headers "Content-Type"]) "text/javascript"))
    (is (= (resp :body) "callback({\"foo\":\"bar\"});"))))

