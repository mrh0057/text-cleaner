(ns text-cleaner.stemmer-test
  (:use text-cleaner.stemmer
        clojure.test))

(deftest stems-test
  (let [words (stems '("helps" "dogs" "cats" "counted" "counting" "lonely"))]
    (is (= (first words) "help"))
    (is (= (second words) "dog"))
    (is (= (nth words 2) "cat"))
    (is (= (nth words 3) "count"))
    (is (= (nth words 4) "count"))
    (is (= (nth words 5) "lone"))))

(run-tests)
