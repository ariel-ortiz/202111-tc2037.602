;;-------------------------------------------------------------------
;; Solución a los problemas 1, 2 y 3 del problemario #6.
;;-------------------------------------------------------------------

(defn insert
  [s n]
  (concat (take-while #(< % n) s)
          [n]
          (drop-while #(< % n) s)))

(defn insertion-sort
  [s]
  (reduce insert () s))

(defn binary
  [n]
  (->> [n ()]
       (iterate (fn [[n result]] 
                  [(quot n 2) (cons (rem n 2) result)]))
       (drop-while (fn [[n _]] (not (zero? n))))
       (first)
       (second)))

(defn pack
  [s]
  (partition-by identity s))