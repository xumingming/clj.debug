(ns clj.debug.core)

(defn ls [ns-name]
  "List all the functions(macros) exposed by the specified namespace"
  (-> 'clojure.set ns-publics keys))
