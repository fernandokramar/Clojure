(ns selft-testing-code.core-test
  (:require [clojure.test :refer :all]
            [selft-testing-code.core :refer :all]))

  ;se a compra for ate 1000, deve se cobrar 15 reais de entrega
  ;se for maior que 100 e menor que 200 cobra 5 reais
  ;se for acima de 200 entrega é gratuita


(deftest taxa-de-entrega-test
  (testing "Dado um valor abaixo de 100, a taxa de entrega deve ser de 15 reais"
    (is (= 15 (taxa-de-entrega 1)))
    (is (= 15 (taxa-de-entrega 100))))
  (testing "Dado um valor entre 100 e 200 reais a taxa de entrega deve ser 5 reais"
    (is (= 5 (taxa-de-entrega 100.01)))
    (is (= 5 (taxa-de-entrega 200))))
  (testing "Dado um valor acima de 200, a taixa de entrega é 0 reais"
    (is (= 0 (taxa-de-entrega 200.02)))))



