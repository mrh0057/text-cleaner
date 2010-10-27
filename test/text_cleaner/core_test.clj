(ns text-cleaner.core-test
  (:use clojure.test
    text-cleaner.core))

(initialize "models/EnglishSD.bin.gz" "models/EnglishTok.bin.gz" "models/tag.bin.gz")

(deftest clean-document-test
  (let [document "Bob how are you doing. ,<>?/--, don't"
        cleaned (clean-document document)]
    (is (= (list "bob" "you") cleaned))))

(run-tests)

