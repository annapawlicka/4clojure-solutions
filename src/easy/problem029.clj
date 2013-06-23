;; http://www.4clojure.com/problem/29

;; Get the Caps
;; Difficulty:	Easy
;; Topics: strings

;; Write a function which takes a string and returns a new string containing only the capital letters.

;; (= (__ "HeLlO, WoRlD!") "HLOWRD")
;; (empty? (__ "nothing"))
;; (= (__ "$#A(*&987Zf") "AZ")

;; Answer:
(fn my-caps [s]
  (->> (filter #(Character/isUpperCase %) s)
    (apply str)))

;; Code:
(= ((fn my-caps [s]
      (->> (filter #(Character/isUpperCase %) s)
        (apply str))) "HeLlO, WoRlD!") "HLOWRD")
(empty? ((fn my-caps [s]
           (->> (filter #(Character/isUpperCase %) s)
             (apply str))) "nothing"))
(= ((fn my-caps [s]
      (apply str (filter #(Character/isUpperCase %) s)
        )) "$#A(*&987Zf") "AZ")


(comment

  Explanation

  Filter function returns a lazy sequence.
  To get a string, we should transform the sequence to string by applying str function.

  Bonus: ->> is a double-arrow threading macro. It passes the argument in as the last argument,
  rather than the first. Could be done without the macro like this
  (defn my-caps [s]
    (apply str (filter #(Character/isUpperCase %) s)))

  )