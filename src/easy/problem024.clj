;; http://www.4clojure.com/problem/24

;; Sum It All Up
;; Difficulty:	Easy
;; Topics: seqs

;; Write a function which returns the sum of a sequence of numbers.

;; (= (__ [1 2 3]) 6)
;; (= (__ (list 0 -2 5 5)) 8)
;; (= (__ #{4 2 1}) 7)
;; (= (__ '(0 0 -1)) -1)
;; (= (__ '(1 10 3)) 14)

;; Answer:
#(reduce + %)


;; Code:
(= (#(reduce + %) [1 2 3]) 6)
(= (#(reduce + %) (list 0 -2 5 5)) 8)
(= (#(reduce + %) #{4 2 1}) 7)
(= (#(reduce + %) '(0 0 -1)) -1)
(= (#(reduce + %) '(1 10 3)) 14)

(comment

  Explanation

  Reduce function that adds first element to the second,
  result to the third element, then the new result to the next element, etc.

  )