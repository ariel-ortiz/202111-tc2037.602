;;-------------------------------------------------------------------
;; Solución al problem 1 del problemario #9.
;;-------------------------------------------------------------------

(defn linear-search
  [vct x eq-fun]
  (loop [index 0]
    (cond
      (= index (count vct)) nil
      (eq-fun x (vct index)) index
      :else (recur (inc index)))))