(ns imc.logic)

(defn- valor-imc
  [peso altura]
  (/ peso (* altura altura)))

(defn indicador-imc [peso altura]
  (if (< (valor-imc peso altura) 18.5)
    :baixo-peso
    (if (< (valor-imc peso altura) 24.9)
    :peso-ideal
    :acima-peso)))

;_________________________________________
;Refatoracao

(defn- valor-imc
  [peso altura]
  (/ peso (* altura altura)))

(defn indicador-imc [peso altura]
  (let [resultado-calculo-imc (valor-imc peso altura)]
  (if (< resultado-calculo-imc 18.5)
    :baixo-peso
    (if (< resultado-calculo-imc 24.9)
      :peso-ideal
      :acima-peso))))
