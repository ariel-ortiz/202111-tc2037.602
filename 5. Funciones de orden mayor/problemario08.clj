;;-------------------------------------------------------------------
;; Solución a los problemas 1 y 2 del problemario #8.
;;-------------------------------------------------------------------

(defn argswap
  [f]
  (fn [x y]
    (f y x)))

(defn there-exists-one
  [pred lst]
  (= 1 (count (filter pred lst))))