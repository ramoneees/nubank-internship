(ns aula06-968.core
  (:require [postal.core :as mail]))

;; 1 - não possui efeitos colaterais (altera o mundo "externo" da função)
;; 2 - Para os mesmos inputs, os mesmos outupts




(spit "test.txt" "ramon é demais")
(slurp "test.txt")



(= 4 (+ 2 2))

(defn retorna-100 []
  (* 10 10))

(def negative-quotient (comp - /))


(memoize ())

(defn sleep-aaa
  [x]
  (Thread/sleep 1000)
  x)



(defn enviar-email [email]
  (mail/send-message {:host "smtp.gmail.com"
                      :user "ramonp.rios@gmail.com"
                      :pass "howhywiuaneqakhy"
                      :port 587
                      :tls true}
                     {:from "ramon@rios.com"
                      :to email
                      :subject "Olá Bia!"
                      :body  [{:type "text/html"
                               :content "<b>Olá. seu email em Clojure chegou!!!!!</b>"}]}))