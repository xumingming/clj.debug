(ns clj.debug.core)

(defn ls [ns-name]
  "List all the functions(macros) exposed by the specified namespace"
  (let [ns-name-sym (symbol ns-name)]
    ;; first try 'require' the namespace
    (require ns-name-sym)
    (-> ns-name-sym ns-publics keys)))
