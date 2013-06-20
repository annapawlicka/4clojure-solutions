;; http://www.4clojure.com/problem/1

;; Nothing but the Truth
;; Difficulty:	Elementary
;; Topics:


;; This is a clojure form. Enter a value which will make the form evaluate to true. Don't over think it! If you are confused, see the getting started page. Hint: true is equal to true.


;; (= ___ true)

;; Answer:
;; true

;; Code:
(= true true)

(comment
  Explanation

  true equals itself. Clojure does not implicitly convert to boolean.
  (= 1 true) ;false
  (= "true" true) ;false

  To convert a non-boolean value to a boolean value, use (boolean)
  (= (boolean 1) true) ;true
  (= (boolean "true") true) ;true
  (= (boolean nil) true) ;false
  All boolean values are truth except for nil.
)