(ns aula05-984.core)

(defn transform-person
  [person]
  (-> person
      (assoc :teste :cor-do-cabelo "azul")
      (update :idade inc)))


(->> (map inc (range 10))
     (filter #(= 0 (mod 2 %)))
     (map inc)
     (reduce +))

(->> "ei, fala baixo!"
     clojure.string/capitalize
     .toUpperCase)


(-> {:a 1 :b 2}
    vals
    (as-> m (map inc m)))
(as-> {} m
  (assoc m :a 1)
  (reduce (fn [acc v]
            (assoc acc (keyword v) v)) m ["ha " "hi " "ho" "hu"]))


(defn descreve-qualidades [nome]
  (cond-> {}
    (= "ramon" nome) (assoc :nome "ramon")
    (= "luis" nome) (assoc :legal? false)
    (= "ramon" nome) (assoc :lindo? true)
    (= "luis" nome) (assoc :chato? true)))

(defn saudacao-custom [mensagem nomes]
  (let [custom-message (fn [nome]
                         (str mensagem " " nome))]
    (as-> custom-message f
      (map f nomes)
      (map clojure.string/upper-case f))))

(defn media [valor-total-somado contagem-valores]
  (/ valor-total-somado contagem-valores))
(defn media-mapa [m]
  (as-> m mapa
    (vals mapa)
    (reduce + mapa)
    (media mapa (-> m vals count))
    (assoc m :media mapa)))