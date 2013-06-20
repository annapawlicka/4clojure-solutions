;; http://www.4clojure.com/problem/8

;; Intro to Sets
;; Difficulty:	Elementary
;; Topics:

;; Sets are collections of unique values.

;; (= __ (set '(:a :a :b :c :c :c :c :d :d)))
;; (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))

;; Answer:
;; #{:a :b :c :d}

;; Code:
(= #{:a :b :c :d} (set '(:a :a :b :c :c :c :d :d)))
(= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d}))

(comment

  Explanation

  The result of first problem will only contain one instance of each of the
  duplicate values.
  The second problem uses the union function from the clojure.set
  namespace. clojure.set/union takes two sets and returns the union of the sets (no duplicates).
)
