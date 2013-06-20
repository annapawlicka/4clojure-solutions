;; http://www.4clojure.com/problem/17

;; Sequences: map
;; Difficulty:	Elementary
;; Topics:

;; The map function takes two arguments: a function (f) and a sequence (s).
;; Map returns a new sequence consisting of the result of applying f to each item of s.
;; Do not confuse the map function with the map data structure.

;; (= __ (map #(+ % 5) '(1 2 3)))

;; Answer:
;; '(6 7 8)

;; Code:
(= '(6 7 8) (map #(+ % 5) '(1 2 3)))

(comment
  Explanation

  The function passed to map is an anonymous function that takes a
  single argument and adds 5.
)