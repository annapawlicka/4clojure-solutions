;; http://www.4clojure.com/problem/27

;; Palindrome Detector
;; Difficulty:	Easy
;; Topics: seqs

;; Write a function which returns true if the given sequence is a palindrome.
;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)

;; (false? (__ '(1 2 3 4 5)))
;; (true? (__ "racecar"))
;; (true? (__ [:foo :bar :foo]))
;; (true? (__ '(1 1 3 3 1 1)))
;; (false? (__ '(:a :b :c)))

;; Answer:
(fn [coll] (= coll (if (string? coll) (clojure.string/reverse coll) (reverse coll))))

;; Code:
(false? ((fn [coll] (= coll (if (string? coll) (clojure.string/reverse coll) (reverse coll)))) '(1 2 3 4 5)))
(true? ((fn [coll] (= coll (if (string? coll) (clojure.string/reverse coll) (reverse coll)))) "racecar"))
(true? ((fn [coll] (= coll (if (string? coll) (clojure.string/reverse coll) (reverse coll))))[:foo :bar :foo]))
(true? ((fn [coll] (= coll (if (string? coll) (clojure.string/reverse coll) (reverse coll))))'(1 1 3 3 1 1)))
(false? ((fn [coll] (= coll (if (string? coll) (clojure.string/reverse coll) (reverse coll)))) '(:a :b :c)))

(comment

  Explanation

  Reverse returns a collection in a reverse order. However, in order to properly reverse Strings,
  clojure.string/reverse must be used.

  string? returns true if an argument is a string.
  )