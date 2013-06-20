;; http://www.4clojure.com/problem/6

;; Intro to Vectors
;; Difficulty:	Elementary
;; Topics:

;; Vectors can be constructed several ways. You can compare them with lists.

;; (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

;; Answer:
;; :a :b :c

;; Code:
(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

(comment
  Explanation
  The vector [:a :b :c] is equivalent to
  '(:a :b :c)
  (list :a :b :c)
  There are two ways of constructing vectors
  (vec '(:a :b :c))
  (vector :a :b :c)
)
