(ns text-cleaner.core-test
  (:use clojure.test
    text-cleaner.core))

(initialize "models/EnglishSD.bin.gz" "models/EnglishTok.bin.gz" "models/tag.bin.gz")

(deftest clean-document-test
  (let [document "Bob how are you doing. Here is a database ER diagram."
        cleaned (clean-document document)]))

(run-tests)

