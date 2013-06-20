;; http://www.4clojure.com/problem/15

;; Double Down
;; Difficulty:	Elementary
;; Topics:

;; Write a function which doubles a number.

;; (= (__ 2) 4)
;; (= (__ 3) 6)
;; (= (__ 11) 22)
;; (= (__ 7) 14)

;; Answer:
;; #(* % 2)

;; Code:
(= (#(* % 2) 2) 4)
(= (#(* % 2) 3) 6)
(= (#(* % 2) 11) 22)
(= (#(* % 2) 7) 14)

(comment
  Uses an anonymous function, as denoted by the #. Takes one argument (referenced by %).
  Multiplies the provided argument by 2.
)
