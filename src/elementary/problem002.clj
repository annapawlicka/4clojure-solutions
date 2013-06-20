;; http://www.4clojure.com/problem/2

;; Simple Math
;; Difficulty:	Elementary
;; Topics:

;; If you are not familiar with polish notation, simple arithmetic might seem confusing.
;; Note: Enter only enough to fill in the blank (in this case, a single number) - do not retype the whole problem.

;; (= (- 10 (* 2 3)) __)

;; Answer:
;; 4

;; Code:
(= (- 10 (* 2 3)) 4)

(comment
  Explanation
  Expression (* 2 3) evaluates to 6.
  Next expression that is evaluated is (- 10 6), which is 4
  This is compared with 4 and results in true being returned.
)
