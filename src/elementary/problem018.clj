;; http://www.4clojure.com/problem/18

;; Sequences: filter
;; Difficulty:	Elementary
;; Topics:

;; The filter function takes two arguments: a predicate function (f) and a sequence (s).
;; Filter returns a new sequence consisting of all the items of s for which (f item) returns true.

;; (= __ (filter #(> % 5) '(3 4 5 6 7)))

;; Answer:
;; '(6 7)

;; Code:
(= '(6 7) (filter #(> % 5) '(3 4 5 6 7)))

(comment
  Explanation

  The function passed to filter is an anonymous function that takes a
  single argument and compares it to 5. If the argument is greater than 5,
  it is added to the new sequence.
)