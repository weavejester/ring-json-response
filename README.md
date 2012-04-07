# ring-json-response

A small library for returning JSON responses from a Ring handler.

## Install

Add the following dependency to your `project.clj` file:

    [ring-json-response "0.1.0']

## Usage

You can write JSON responses using the `json-response` method:

```clojure
(use 'ring.util.json-response)

(defn handler [request]
  (json-response {:foo "bar"})
```

Or use middleware to convert any response with a map as a body into
JSON:

```clojure
(use 'ring.middleware.json-response
     'ring.util.response)

(defn handler [request]
  (response {:foo "bar"}))

(def app
  (wrap-json-response handler))
```

## License

Copyright © 2012 James Reeves

Distributed under the Eclipse Public License, the same as Clojure.
