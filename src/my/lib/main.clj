(ns my.lib.main
  (:gen-class))

(defn get-time [] (java.util.Date.))
(def current-time (get-time))
(defmacro time-at-compile [] current-time)

(println (str "top level time-at-compile: " (time-at-compile)))
(println (str "top level get-time: " current-time))

(defn -main [& args]
  (println (str "main time-at-compile: " (time-at-compile)))
  (println (str "top level get-time: " current-time)))
