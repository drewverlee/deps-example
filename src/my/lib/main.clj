(ns my.lib.main
  (:gen-class))

(defn get-time [] (java.util.Date.))
(def time-def (get-time))
(defmacro time-macro [] time-def)
(defonce time-def-delay (delay time-def))

(println "hello")
(println "time-def: " time-def)
(println  "time-macro:" (time-macro))
(println "time-def-delay: " @time-def-delay)

(defn -main [& args])
