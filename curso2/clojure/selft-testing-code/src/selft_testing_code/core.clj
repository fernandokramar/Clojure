(ns selft-testing-code.core)

;se a compra for ate 1000, deve se cobrar 15 reais de entrega
;se for maior que 100 e menor que 200 cobra 5 reais
;se for acima de 200 entrega é gratuita

(defn taxa-de-entrega
  [valor-da-compra]
  (if ( <= valor-da-compra 100)
    15
    (if (<= valor-da-compra 200)
      5
      0)))


