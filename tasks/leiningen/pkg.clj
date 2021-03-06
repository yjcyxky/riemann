(ns leiningen.pkg
  (:use [leiningen.uberjar :only [uberjar]]
        [leiningen.fatdeb :only [fatdeb]]
        [leiningen.fatrpm6 :only [fatrpm6]]
        [leiningen.fatrpm7 :only [fatrpm7]]
        [leiningen.tar :only [tar]]))

(defn pkg [project]
  (doto project
    (uberjar)
    (tar false)
    (fatrpm6 false)
    (fatrpm7 false)
    (fatdeb false)))
