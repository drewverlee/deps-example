(ns lib.main
  (:require [clojure.java.io :as io])
  (:gen-class))

(defmacro foo [] (slurp (io/resource "foo.sql")))

(defn -main [& args]
  (println (slurp (io/resource "foo.sql"))))
