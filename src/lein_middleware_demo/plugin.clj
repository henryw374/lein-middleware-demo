(ns lein-middleware-demo.plugin)

(defn middleware [project]
  ;(println " " (:source-paths project))
  (-> project
    (update :source-paths
      (fn [existing] (vec (conj existing  (last existing)))))))
