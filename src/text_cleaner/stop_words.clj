(ns text-cleaner.stop-words)

(def english-stop-words
     (hash-set "i" "a" "about" "an" "are" "as" "at" "be" "by" "com" "do" "for" "from" "how" "in" "is" "it" "of" "that" "the" "this" "to" "was" "what" "when" "where" "who" "will" "with" "www"))

(defn remove-stop-words [words]
  (filter #(not (contains? english-stop-words %)) words))
