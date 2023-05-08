(ns aula04.core)

(defn saudacao [periodo-dia]
  (try
    (case periodo-dia
      :bom-dia "Bom dia"
      :boa-tarde "Boa tarde"
      :boa-noite "Boa noite")
    (catch IllegalArgumentException e
      "Essa função deu errado")
    (finally "hehehhehe")))


(defn saudacao-2 [periodo-dia]
  (try (cond
         (= :bom-dia periodo-dia) "Bom dia"
         (= :boa-tarde periodo-dia) "boa tarde"
         (= :boa-noite periodo-dia) "boa noite"
         :else (map :b [{:b 1}]))
       (catch IllegalArgumentException e
         "Essa função deu errado")
       (finally "hehehhehe")))


(defn checa-valor [valor]
  (if (not-empty valor)
    (do
      (println "EU TENHO VALOOOOOR!!!!!")
      "Tem valor")
    (do
      (println "EU SOU UM FRACASSADOOOO!!!!!")
      "Nao tem valor")))




#_(if (= :bom-dia periodo-dia)
    "Bom dia"
    (if (= :boa-tarde periodo-dia)
      "Boa tarde"
      (if (= :boa-noite periodo-dia)
        "Boa noite"
        "Que danado é isso??")))


(mapv #(println (str "hahaha " %)) [1 "ramon0 " :test 'hello])

(doseq [i [0 1 2 2 3]]
  (println "heehe" (inc i)))


(doseq [nome ["Luis" "Juliana" "Brenda" "Yasmin" "Thais" "Ramon"]
        mensagem ["É demais" "Nota 10 " " Uma Joia Rara" "Um alecrim Dourado" "Um doce de côco"  "o melhor de todos os tempos"]]

  (prn (str nome " " mensagem)))


(clojure.pprint/pprint
 (doseq [nome ["Luis" "Juliana" "Brenda" "Yasmin" "Thais" "Ramon"]
         motivacoes ["É demais" "Nota 10 " " Uma Joia Rara" "Um alecrim Dourado" "Um doce de côco"  "o melhor de todos os tempos"]
         desmotivacional ["Não tomou banho" "Não escovou os dentes" "Não é o primo que deu certo na vida" "Já ta namorando? "]]
   (do
     (println nome " " motivacoes)
     (println nome " " desmotivacional))))

(for [x [0 1 2 3 4 5]
      :let [y (* x 3)]
      :when (even? y)]
  y)