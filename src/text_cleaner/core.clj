(ns #^{:doc "Core for the text cleaner module.

need to call initialize before using any other functions."} 
      text-cleaner.core
  (:use 
    opennlp.nlp
    opennlp.tools.filters
    text-cleaner.stemmer))

(def get-sentences)

(def tokenize)

(def pos-tag)

(defn filter-tags [tag-list]
  tag-list)

(defn initialize [sentence-detector tokenizer pos-tagger]
  "Used to initialize the nlp settings.  This must be called before all other methods.

sentence-dector - The path to the sentence detector model
tokenizer - The path to the tokenizer.
pos-tagger - The path to the pos-tagger."
  (def get-sentences (make-sentence-detector sentence-detector))
  (def tokenize (make-tokenizer tokenizer))
  (def pos-tag (make-pos-tagger pos-tagger)))

(defn clean-document [document]
  "Used to clean up a document text

document - The document as a string of text.  Tokenizes the words and stems them.

return The list of words."
  (filter-tags (stems (tokenize document))))

