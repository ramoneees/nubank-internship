(ns aula07-984.core)

;; imutabilidade


(def vetor [3])

(defn adiciona-no-array [valor]
  (let [vetor-1 (conj vetor 5)
        vetor-2 (conj vetor 6)]
    (conj vetor-2 valor)))


(defn remove-valor-array [v]
  (adiciona-no-array v))

