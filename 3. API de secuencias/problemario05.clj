;;-------------------------------------------------------------------
;; Solución a los problemas 1 y 2 del problemario #5.
;;-------------------------------------------------------------------

(defn positives
  [s]
  (filter pos? s))

(defn dot-product
  [a b]
  (reduce + (map * a b)))