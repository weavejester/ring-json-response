# ring-json-response

A small library for returning JSON responses from a Ring handler.

## Install

Add the following dependency to your `project.clj` file:

    [ring-json-response "0.1.0-SNAPSHOT"]

## Usage

```clojure
(use 'ring.util.json)

(defn handler [request]
  (json-response {:foo "bar"})
```

## License

Copyright © 2012 James Reeves

Distributed under the Eclipse Public License, the same as Clojure.
