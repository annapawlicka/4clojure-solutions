;; http://www.4clojure.com/problem/3

;; Intro to Strings
;; Difficulty:	Elementary
;; Topics:

;; Clojure strings are Java strings. This means that you can use any of the Java string methods on Clojure strings.

;; (= __ (.toUpperCase "hello world"))

;; Answer:
;; "HELLO WORLD"

;; Code:
(= "HELLO WORLD" (.toUpperCase "hello world"))

(comment
  Explanation
  toUpperCase() is a Java method that converts a string to uppercase.
  Strings in Clojure are Java String objects. Native java methods are invoked by calling
  them preceded with a dot character.
)
