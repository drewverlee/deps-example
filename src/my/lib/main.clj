(ns my.lib.main
  (:require
   [clojure.java.io    :as io]
   [clojure.java.shell :as sh])
  (:gen-class))

(defn -main [& args]
  (sh/with-sh-dir (io/resource "my")
    (println (sh/sh "ls"))))
