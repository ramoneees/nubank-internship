(ns aula05-968.core)


(defn embelezar [pessoa]
  (-> pessoa
      (assoc :corte-de-cabelo? true)
      (assoc :skin-care? true)
      (update :idade #(- % 5))
      (as-> p (conj [] p))))


(embelezar {:nome "Atila" :idade 30})

(def resto-0-de-100 (fn [n]
                      (when (= 0 (mod 100 10))
                        n)))

(->> (range 10)
     (mapv inc)
     (filter resto-0-de-100)
     (map str))

(keep (fn [n]
        (let [n (inc n)]
          (when (= 0 (mod 100 n))
            (str n)))) (range 10))

(map str (filter (fn [n]
                   (= 0 (mod 100 n))) (mapv inc (range 10))))

(as-> (range 10) numbers
  (map inc numbers)
  (first numbers)
  (* numbers 100))



(defn descrever-numero [n]
  (cond->> []
    (pos? n) (conj "positivo")
    (even? n) (conj "par")))

(descrever-numero -5)


(defn recebe-string [s]
  (cond-> s
    (clojure.string/ends-with? s "?") (str " " "Sim! ")
    (= s (clojure.string/upper-case s)) (str " " "TA DEBAIXO DA CACHOEIRA?")))



(some->> 10
         inc
         resto-0-de-100
         str)

(defn media [valor-total-somado contagem-valores]
  (/ valor-total-somado contagem-valores))

(defn media-mapa [m]
  (try (as-> m mapa
         (vals mapa)
         (reduce + mapa)
         (media mapa (-> m vals count))
         (assoc m :media mapa))
       (catch Exception e
         (str "essa porra não funciona por causa do "
              (reduce-kv (fn [m k v]
                           (if (not (number? v))
                             (assoc m :broken-key k)
                             m)) {} m)))))