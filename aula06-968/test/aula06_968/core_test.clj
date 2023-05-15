(ns aula06-968.core-test
  (:require [aula06-968.core :refer :all]
            [clojure.test :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(deftest funcao-pura
  (testing "funcao pura"
    (is (= 4 4)))

  (testing "pureza mais complexa"
    (is (= 10
           (-> (retorna-100)
               (/ 10))))))