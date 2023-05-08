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