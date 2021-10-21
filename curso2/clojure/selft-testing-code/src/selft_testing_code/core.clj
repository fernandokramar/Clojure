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


;Solicitação do Cliente:
;Valores abaixo de mil reais não tem imposto retido na fonte.
;Acima disso pagam 10% de imposto

(defn imposto-retido-fonte
  [valor]
  (if (< valor 1000)
    0
  (* valor 0.1)))

;Solicitação do Cliente:
;Valores abaixo de mil reais não tem imposto retido na fonte.
;Acima disso pagam 10% de imposto

;defn- = funcao privada
(defn- esta-na-faixa-isencao?
  [valor]
  (< valor 1000))

(defn imposto-retido-fonte
  [valor]
  (if (esta-na-faixa-isencao? valor)
    0
    (* valor 0.1)))

;funcao de primeira ordem

