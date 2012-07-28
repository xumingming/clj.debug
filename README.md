# clj.debug

Contain some useful debuging/util functions that will be useful in daily programming.

## Usage

`ls`

```clojure
#<core$ls clj.debug.core$ls@3823bdd1>
user=> (ls "clojure.set")
(rename-keys union select project superset? join subset? intersection map-invert difference rename index)
user=> (ls 'clojure.set)
(rename-keys union select project superset? join subset? intersection map-invert difference rename index)
```

## License

Copyright (C) 2012 xumingming

Distributed under the Eclipse Public License, the same as Clojure.
