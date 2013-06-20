;; http://www.4clojure.com/problem/10

;; Intro to Maps
;; Difficulty:	Elementary
;; Topics:

;; Maps store key-value pairs. Both maps and keywords can be used as lookup functions
;; Commas can be used to make maps more readable, but they are not required.

;; (= __ ((hash-map :a 10, :b 20, :c 30) :b))
;; (= __ (:b {:a 10, :b 20, :c 30}))

;; Answer:
;; 20

;; Code:
(= 20 ((hash-map :a 10 :b 20 :c 30) :b))
(= 20 (:b {:a 10 :b 20 :c 30}))

(comment

  Explanation
  In the first problem, a new hash-map is created {:a 10 :b 20 :c 30}. The keyword :b is then used as a
  lookup function, which returns the value 20.
  In the second problem, :b is also used as a lookup to retrieve a
  value from the existing hashmap {:a 10, :b 20, :c 30}.
)
