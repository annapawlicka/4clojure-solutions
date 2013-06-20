;; http://www.4clojure.com/problem/20

;; Penultimate Element
;; Difficulty:	Easy
;; Topics: seqs

;; Write a function which returns the second to last element from a sequence.

;; (= (__ (list 1 2 3 4 5)) 4)
;; (= (__ ["a" "b" "c"]) "b")
;; (= (__ [[1 2] [3 4]]) [1 2])

;; Answer:
;; #(nth % (- (count %) 2))

;; Code:
(= (#(nth % (- (count %) 2)) (list 1 2 3 4 5)) 4)
(= (#(nth % (- (count %) 2)) ["a" "b" "c"]) "b")
(= (#(nth % (- (count %) 2)) [[1 2] [3 4]]) [1 2])

(comment
  Explanation

  As in previous exercise, but subtracting 2 from count.
  )