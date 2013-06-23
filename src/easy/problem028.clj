;; http://www.4clojure.com/problem/28

;; Flatten a Sequence
;; Difficulty:	Easy
;; Topics: seqs core-functions

;; Write a function which flattens a sequence.
;; Special Restrictions: flatten

;; (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
;; (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
;; (= (__ '((((:a))))) '(:a))

;; Answer:
(fn my-flatten [v]
  (if(sequential? v)
    (vec (apply concat (map my-flatten v)))
    [v]))

;; Code:
(= ((fn my-flatten [v] (if(sequential? v) (vec (apply concat (map my-flatten v))) [v])) '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
(= ((fn my-flatten [v] (if(sequential? v) (vec (apply concat (map my-flatten v))) [v]))["a" ["b"] "c"]) '("a" "b" "c"))
(= ((fn my-flatten [v] (if(sequential? v) (vec (apply concat (map my-flatten v))) [v])) '((((:a))))) '(:a))

(comment

  Explanation

  Function first checks if the collection implements Sequential, and if it does,
  it does the following
  - creates a new vector by applying concat to each element of a sequence
  - maps through the collection applying my-flatten function (works on nested sequences)

  I cheated on this one, and solution is a result of a few suggestions I found on forums/blogs. I am disappoint.
  )