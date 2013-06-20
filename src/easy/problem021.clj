;; http://www.4clojure.com/problem/21

;; Nth Element
;; Difficulty:	Easy
;; Topics: seqs core-functions

;; Write a function which returns the Nth element from a sequence.
;; Special restrictions: nth

;; (= (__ '(4 5 6 7) 2) 6)
;; (= (__ [:a :b :c] 0) :a)
;; (= (__ [1 2 3 4] 1) 2)
;; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])

;; Answer:
(comment
    (fn [collection index]
      (if (zero? index)
        (first collection)
      (recur (rest collection) (- index 1))))
)

;; Code:
(= ((fn [collection index] (if (zero? index) (first collection) (recur (rest collection) (- index 1)))) '(4 5 6 7) 2) 6)
(= ((fn [collection index] (if (zero? index) (first collection) (recur (rest collection) (- index 1)))) [:a :b :c] 0) :a)
(= ((fn [collection index] (if (zero? index) (first collection) (recur (rest collection) (- index 1)))) [1 2 3 4] 1) 2)
(= ((fn [collection index] (if (zero? index) (first collection) (recur (rest collection) (- index 1)))) '([1 2] [3 4] [5 6]) 2) [5 6])


(comment
  Explanation

  The anonymous function takes 2 arguments. A collection (collection), and the
  index position of the element to return (index). If index is 0, it returns the
  first element of the collection. Otherwise, it uses recur to
  recursively call the anonymous function passing the rest of the
  collection and index - 1.
)