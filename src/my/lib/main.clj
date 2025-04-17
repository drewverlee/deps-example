(ns my.lib.main
  (:gen-class))

(defn get-time [] (java.util.Date.))
(def time-def (get-time))
(defmacro time-macro [] time-def)

(println "time-def: " time-def)
(println  "time-macro:" (time-macro))

(defn -main [& args])
