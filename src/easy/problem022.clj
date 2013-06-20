;; http://www.4clojure.com/problem/22

;; Count a Sequence
;; Difficulty:	Easy
;; Topics: seqs core-functions

;; Write a function which returns the total number of elements in a sequence
;; Special restrictions: count

;; (= (__ '(1 2 3 3 1)) 5)
;; (= (__ "Hello World") 11)
;; (= (__ [[1 2] [3 4] [5 6]]) 3)
;; (= (__ '(13)) 1)
;; (= (__ '(:a :b :c)) 3)

;; Answer:
;; (fn [coll] (reduce (fn [n _] (inc n)) 0 coll))

;; Code:
(= ((fn [coll] (reduce (fn [n _] (inc n)) 0 coll)) '(1 2 3 3 1)) 5)
(= ((fn [coll] (reduce (fn [n _] (inc n)) 0 coll)) "Hello World") 11)
(= ((fn [coll] (reduce (fn [n _] (inc n)) 0 coll)) [[1 2] [3 4] [5 6]]) 3)
(= ((fn [coll] (reduce (fn [n _] (inc n)) 0 coll)) '(13)) 1)
(= ((fn [coll] (reduce (fn [n _] (inc n)) 0 coll)) '(:a :b :c)) 3)

(comment

  Explanation

  Reduce accepts two arguments
  function f
  value v
  collection coll.

  Function f should accept 2 arguments. However, in this case the function will only increment the counter,
  it will not work on the collection. Therefore our function needs only one argument, the counter. Second argument is
  the underscore (it is used in Clojure as a placeholder for a required but unused argument).
  (fn [n _] (inc n))

  Value supplied is 0. If val is supplied, reduce returns the result of applying function f to val and the first
  item in coll, then applying f to that result and the second item, etc. If coll contains no items,
  returns val and f is not called.
  In this case, we use reduce for the side-effect. We do not do anything with the values of the elements in the
  collection, we simply increment the counter every time reduce moves to the next element.

)