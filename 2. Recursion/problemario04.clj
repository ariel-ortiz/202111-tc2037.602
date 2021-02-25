;;-------------------------------------------------------------------
;; Solución a los problemas 1, 2, 3 y 4 del problemario #4.
;;-------------------------------------------------------------------

;; Fundamental definitions
(defn INC [n] (cons () n))
(defn DEC [n] (rest n))
(def ZERO ())

;; Additional definitions
(defn ZERO? [n] (= n ZERO))
(def ONE   (INC ZERO))
(def TWO   (INC ONE))
(def THREE (INC TWO))
(def FOUR  (INC THREE))
(def FIVE  (INC FOUR))
(def SIX   (INC FIVE))
(def SEVEN (INC SIX))
(def EIGHT (INC SEVEN))
(def NINE  (INC EIGHT))
(def TEN   (INC NINE))

(defn ADD [x y]
  (if (ZERO? x)
    y
    (INC (ADD (DEC x) y))))

(defn SUB [x y]
  (if (ZERO? y)
    x
    (DEC (SUB x (DEC y)))))

(defn MUL [x y]
  (if (ZERO? x)
    ZERO
    (ADD y (MUL (DEC x) y))))

(defn LESS? [x y]
  (if (ZERO? x)
    (if (ZERO? y)
      false
      true)
    (if (ZERO? y)
      false
      (LESS? (DEC x) (DEC y)))))
