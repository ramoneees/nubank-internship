(ns aula04-968.core)

(defn mood [mood]
  (case mood
    "feliz" (str "Feliz por te ver feliz ")
    "triste" (str "Alegria de pobre dura pouco")
    "ansioso" "Rivotril ta na promoção"
    "Tem esse mood aqui não irmão"))


(defn aaaaaa [valor1 valor2]
  (cond-> {}
    (= valor1 valor2) (assoc :condicao-1 (* valor1 valor2))
    (= 0 (mod valor1 valor2)) (assoc :condicao-2 (/ valor1 valor2))))


(dotimes [i [1 2 3 4]]
  (println "my turn " i))

(for [a [{:a 1} {:b 3}]
      b [{:c 2} {:d 5}]
      c [{:e 2} {:f 5}]]
  (merge a b c))