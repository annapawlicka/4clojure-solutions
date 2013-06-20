;; http://www.4clojure.com/problem/7

;; Vectors: conj
;; Difficulty:	Elementary
;; Topics:

;; When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.

;; (= __ (conj [1 2 3] 4))
;; (= __ (conj [1 2] 3 4))

;; Answer:
;; [1 2 3 4]

;; Code:
(= [1 2 3 4] (conj [1 2 3] 4))
(= [1 2 3 4] (conj [1 2] 3 4))

(comment

  Explanation

  With vectors, conj "adds" the element to the end of the vector, as opposed to
  lists where it adds it to the front.
)
