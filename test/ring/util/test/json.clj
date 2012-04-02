(ns ring.util.test.json
  (:use ring.util.json
        clojure.test))

(deftest json-response-test
  (let [resp (json-response {:foo "bar"})]
    (is (= (get-in resp [:headers "Content-Type"]) "application/json"))
    (is (= (resp :body) "{\"foo\":\"bar\"}"))))
