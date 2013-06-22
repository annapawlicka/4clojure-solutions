;; http://www.4clojure.com/problem/26

;; Fibonacci Sequence
;; Difficulty:	Easy
;; Topics: Fibonacci seqs

;; Write a function which returns the first X fibonacci numbers.

;; (= (__ 3) '(1 1 2))
;; (= (__ 6) '(1 1 2 3 5 8))
;; (= (__ 8) '(1 1 2 3 5 8 13 21))

;; Answer:
(fn [x]
  (loop [a 1, b 1, result [1]]
    (if (>= (count result) x)
      result
      (recur b (+ a b) (conj result b)))))

;; Code:
(= ((fn [x] (loop [a 1, b 1, result [1]] (if (>= (count result) x) result (recur b (+ a b) (conj result b))))) 3) '(1 1 2))
(= ((fn [x] (loop [a 1, b 1, result [1]] (if (>= (count result) x) result (recur b (+ a b) (conj result b))))) 6) '(1 1 2 3 5 8))
(= ((fn [x] (loop [a 1, b 1, result [1]] (if (>= (count result) x) result (recur b (+ a b) (conj result b))))) 8) '(1 1 2 3 5 8 13 21))

(comment

  Explanation

  Function loops through sequence until the size of the new sequence is the same as x.
  Until then, it recursively executes the following
  - a is set to the value of b
  - b is set to the sum of a and b
  - values of b is added to the new sequence.

  )