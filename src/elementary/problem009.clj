;; http://www.4clojure.com/problem/9

;; Sets: conj
;; Difficulty:	Elementary
;; Topics:

;; When operating on a set, the conj function returns a new set with one or more keys "added".

;; (= #{1 2 3 4} (conj #{1 4 3} __))

;; Answer:
;; 2

;; Code:
(= #{1 2 3 4} (conj #{1 4 3} 2))

(comment

  Explanation

  In a list, conj adds the new element to the front of the list.
  In a vector, conj adds the new element to the end of the vector.
  In a set, conj adds the new element to the set in an ordered position.
  The set has its elements sorted.
)
