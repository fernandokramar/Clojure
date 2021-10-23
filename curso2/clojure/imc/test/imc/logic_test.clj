(ns imc.logic-test
  (:require [clojure.test :refer :all]
            [imc.logic :refer :all]))



(deftest valor-imc-test
  (testing "uma pessoa muito magra deve ter IMC baixo"
    (is (= :baixo-peso (indicador-imc 1 2))))
  (testing "Uma pessoa com peso ideal deve ter IMC ideal"
    (is (= :peso-ideal (indicador-imc 70 1.70))))
  (testing "uma pessoa acima do peso ideal deve ter imc acima do peso"
    (is (= :acima-peso(indicador-imc 100 1.50)))))

