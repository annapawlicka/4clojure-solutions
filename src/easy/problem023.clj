;; http://www.4clojure.com/problem/23

;; Reverse a Sequence
;; Difficulty:	Easy
;; Topics: seqs core-functions

;; Write a function which reverses a sequence.
;; Special restrictions: reverse rseq

;; (= (__ [1 2 3 4 5]) [5 4 3 2 1])
;; (= (__ (sorted-set 5 7 2 7)) '(7 5 2))
;; (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])


;; Answer:
(comment
  (fn [coll]
    (loop [r (rest coll) result (conj () (first coll))]
      (if (empty? r)
        result
        (recur (rest r) (conj result (first r))))))
  )


;; Code:
(= ((fn [coll]
  (loop [r (rest coll) result (conj () (first coll))]
    (if (empty? r)
      result
      (recur (rest r) (conj result (first r)))))) [1 2 3 4 5]) [5 4 3 2 1])
(= ((fn [coll]
      (loop [r (rest coll) result (conj () (first coll))]
        (if (empty? r)
          result
          (recur (rest r) (conj result (first r)))))) (sorted-set 5 7 2 7)) '(7 5 2))
(= ((fn [coll]
      (loop [r (rest coll) result (conj () (first coll))]
        (if (empty? r)
          result
          (recur (rest r) (conj result (first r)))))) [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

;; Answer 2:
#(reduce conj () %)

;; Code 2:
(= (#(reduce conj () %) [1 2 3 4 5]) [5 4 3 2 1])
(= (#(reduce conj () %) (sorted-set 5 7 2 7)) '(7 5 2))
(= (#(reduce conj () %)  [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

(comment

  Explanation

  Solution 1
  Recursively looping through items in a sequence (loop acts as a recur target).
  Loop uses two bindings
  r - the rest of the sequence
  result - first element of the sequence added to the new sequence (conj'ed).
  If there are no more elements in the sequence (empty? r), the new sequence is returned.
  Otherwise, recur executes loop again with updated bindings.

  Solution 2
  Much shorter higher-order reduce that uses conj as a function and adds each element to
  the new sequence.

  )