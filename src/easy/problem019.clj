;; http://www.4clojure.com/problem/19

;; Last element
;; Difficulty:	Easy
;; Topics: seqs core-functions

;; Write a function which returns the last element in a sequence.

;; (= (__ [1 2 3 4 5]) 5)
;; (= (__ '(5 4 3)) 3)
;; (= (__ ["b" "c" "d"]) "d")

;; Answer:
;; #(nth % (dec (count %)))

;; Code:
(= (#(nth % (dec (count %))) [1 2 3 4 5]) 5)
(= (#(nth % (dec (count %))) '(5 4 3)) 3)
(= (#(nth % (dec (count %)))  ["b" "c" "d"]) "d")

(comment
  Explanation

  The nth function returns the value at the index of a collection.
  Count function can be used to determine how many elements are in the
  collection. Must subtract 1 from the count as nth is zero-based - using dec function that
  returns a number one less than argument.

)