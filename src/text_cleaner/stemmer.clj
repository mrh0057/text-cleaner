(ns text-cleaner.stemmer
  (:import org.tartarus.snowball.ext.EnglishStemmer))

(def snow-ball-english)

(defn- stem [word]
  (doto snow-ball-english
    (. setCurrent word)
    (. stem))
  (. snow-ball-english getCurrent))

(defn stems [words]
  "Used to stem a list of words.

words - The words to stem.

returns the list of words to stem."
  (binding [snow-ball-english (new EnglishStemmer)]
    (doall (map stem words))))
