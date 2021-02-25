;;-------------------------------------------------------------------
;; Solución a los problemas 1 y 2 del problemario #2.
;;-------------------------------------------------------------------

;; Factorial recursivo
(defn ! [n]
  (if (zero? n)
    1
    (*' n (! (dec n)))))

;; Factorial usando loop/recur
(defn ! [n]
  (loop [i 1
         r 1]
    (if (> i n)
      r
      (recur (inc i) (*' r i)))))

;; add-list recursivo
(defn add-list
  [lst]
  (if (empty? lst)
    0
    (+ (first lst) 
       (add-list (rest lst)))))

;; add-list usando loop/recur
(defn add-list
  [lst]
  (loop [new-lst lst
         accum 0]
    (if (empty? new-lst)
      accum
      (recur (rest new-lst) (+ accum (first new-lst))))))
