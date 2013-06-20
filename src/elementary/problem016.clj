;; http://www.4clojure.com/problem/16

;; Hello World
;; Difficulty:	Elementary
;; Topics:

;; Write a function which returns a personalized greeting.

;; (= (__ "Dave") "Hello, Dave!")
;; (= (__ "Jenn") "Hello, Jenn!")
;; (= (__ "Rhea") "Hello, Rhea!")

;; Answer:
;; #(str "Hello, " % "!")

;; Code:
(= (#(str "Hello, " % "!") "Dave") "Hello, Dave!")
(= (#(str "Hello, " % "!") "Jenn") "Hello, Jenn!")
(= (#(str "Hello, " % "!") "Rhea") "Hello, Rhea!")

(comment

  Explanation

  Uses an anonymous function #. Takes one
  argument (%). Uses clojure's str function to concatenate the text with the
  argument.
)
