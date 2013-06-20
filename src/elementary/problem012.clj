;; http://www.4clojure.com/problem/12

;; Intro to Sequences
;; Difficulty:	Elementary
;; Topics:

;; All Clojure collections support sequencing. You can operate on sequences with functions like first, second, and last.

;; (= __ (first '(3 2 1)))
;; (= __ (second [2 3 4]))
;; (= __ (last (list 1 2 3)))

;; Answer:
;; 3

;; Code:
(= 3 (first '(3 2 1)))
(= 3 (second [2 3 4]))
(= 3 (last (list 1 2 3)))
