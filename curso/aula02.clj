;função desconto
(defn valor-descontado
    "Retorna o valor com desconto de 10%."
    [valor-bruto]
    (* valor-bruto (- 1 0.10)))
;chamando a função
(valor-descontado 100)

;função desconto igual a anterior simbolo desconto Global
(defn valor-descontado
    "Retorna o valor com desconto de 10%."
    [valor-bruto]
    (def desconto 0.10)
    (* valor-bruto (- 1 desconto)))
;chamando a função
(valor-descontado 100)

; let = local : retorna o ultimo valor 
; def = global

;função desconto igual a anterior simbolo desconto Local
(defn valor-descontado
    "Retorna o valor com desconto de 10%."
    [valor-bruto]
    (let [desconto 0.10])
    (* valor-bruto (- 1 desconto)))
;chamando a função
(valor-descontado 100)

;função desconto igual a anterior simbolo desconto Local
(defn valor-descontado
    "Retorna o valor com desconto de 10%."
    [valor-bruto]
    (let [desconto 0.10]
     (* valor-bruto (- 1 desconto)))
   )
;chamando a função
(valor-descontado 100)

;função desconto igual a anterior simbolo desconto Local
(defn valor-descontado
    "Retorna o valor com desconto de 10%."
    [valor-bruto]
    (let [desconto (/ 10 100)]
     (println "Calculando desconto de " desconto)
     (* valor-bruto (- 1 desconto)))
   )
;chamando a função
(valor-descontado 100)