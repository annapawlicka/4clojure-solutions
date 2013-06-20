;; http://www.4clojure.com/problem/11

;; Maps: conj
;; Difficulty:	Elementary
;; Topics:

;; When operating on a map, the conj function returns a new map with one or more key-value pairs "added".

;; (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))

;; Answer:
;; [:b 2]

;; Code:
(= {:a 1, :b 2, :c 3} (conj {:a 1} [:b 2] [:c 3]))

(comment

  Explanation

  The conj function is called on the existing map {:a 1}. First the
  pair [:b 2] is added to the map. Then pair [:c 3] is added to
  the result of the previous conj.
)
