;; http://www.4clojure.com/problem/25

;; Find the odd numbers
;; Difficulty:	Easy
;; Topics: seqs

;; Write a function which returns only the odd numbers from a sequence.

;; (= (__ #{1 2 3 4 5}) '(1 3 5))
;; (= (__ [4 2 1 6]) '(1))
;; (= (__ [2 2 4 6]) '())
;; (= (__ [1 1 1 3]) '(1 1 1 3))

;; Answer:
#(filter odd? %)

;; Code:
(= (#(filter odd? %) #{1 2 3 4 5}) '(1 3 5))
(= (#(filter odd? %) [4 2 1 6]) '(1))
(= (#(filter odd? %) [2 2 4 6]) '())
(= (#(filter odd? %) [1 1 1 3]) '(1 1 1 3))

(comment

  Explanation

  Filter returns a lazy sequence of the items in collection for which
  condition returns true. Condition must be free of side-effects.

  )