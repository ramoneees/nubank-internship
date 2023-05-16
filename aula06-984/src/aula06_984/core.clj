(ns aula06-984.core
  (:require [postal.core :as mail]))

(def x 12)

(def y (+ x 20))

(mail/send-message
 {:host "smtp.gmail.com"
  :user "ramonp.rios@gmail.com"
  :pass "howhywiuaneqakhy"
  :port 587
  :tls true}
 {:from "ramon@rios.com"
  :to "luisguirc@gmail.com"
  :subject "Juliana"
  :body [{:type "text/html"
          :content "<b>Test!</b>"}]})

(time  y)

(insert!)
(defn my-fn! [])
(defn impuro []
  (if (= 10 x)
    "Impuro"
    "Impuro na mesma"))

(defn aaaaaaaa [estado-emocional]
  (case estado-emocional
    "feliz" "TO GRITANDO DE FELICIDADE"
    "raiva" "TO P DA VIDA"
    "triste" "EU QUERO SER EMO DE NOVO"
    "EU N SEI PORQUE TO GRITANDO"))


(defn calma [mood]
  (clojure.string/lower-case mood))


((comp #(/ % 100) #(* 1000 %)) 100)

(defn loucura []
  (println "LOUCURA LOUCURA LOUCURA")
  (range (*' 100 10000)))

(def loucura-memoizada (memoize loucura))

(defn fibonaci [x]
  (take x
        (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1]))))


(defn fib [n]
  (condp = n
    0 1
    1 1
    (+ (fib (dec n)) (fib (- n 2)))))
(defn cresce [n]
  (inc n))

(def fibo-memo (memoize fibonaci))

(def m-fib
  (memoize (fn [n]
             (condp = n
               0 1
               1 1
               (+ (m-fib (dec n)) (m-fib (- n 2)))))))



(spit "mydoc.txt" "Ramon é demais")