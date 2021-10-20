;REPL(Read Eval Print Loop)
;nil = null 

["marcio" "frayze" 39 3.14]

; conta a quantidade de elementos 
(count [1 2 3 4])

; conj adiciona um valor no vetor (primeiro vetor depois o elemento que quero colocar no vetor)
(conj [1 2 3 4] 5)

; pop remover o ultimo valor do vetor 
(pop ["marcio" "Joao" "Maria"])

;peek ele retorna o ultimo valor do vetor
(peek ["marcio" "Joao" "Maria"])

; retorna o ultimo valor e adiciona um valor no fim do vetor
(peek ( conj [1 2 3 4] 5 ))

;defn definbir função (se criar a funcao de novo com o mesmo nome ele substitui o atual)
(defn imprimir-ola [](println "Ola Mundo"))

;defn definbir função 
(defn parabeniza [nome] (println "Parabéns!!" nome ))
;quando for executar(nome da funcao + argumento) 
(parabenizar "Marcos")

;defn definbir função 
(defn parabeniza 
  [nome] 
  (println "Seja bem vindo")
  (println "Parabéns!!" nome )
  (println "voce fez uma otima escolha"))
;quando for executar(nome da funcao + argumento) 
(parabenizar "Marcos")

;defn definbir função 
(defn parabeniza 
  [nome sobrenome] 
  (println "Seja bem vindo")
  (println "Parabéns!!" nome sobrenome )
  (println "voce fez uma otima escolha"))
;quando for executar(nome da funcao + argumento) 
(parabenizar "Marcos" "silva")

;calculo de 10% multa 
(defn valor-multa 
  [valor]
  (* valor 0.1))

 ;calculo de 10% multa 
(defn valor-multa 
  [valor]
  (let [percentual-multa 0.1]
  (* valor percentual-multa)))

;calculo mais soma do valor da multa 
(defn valor-total
  [valor]
  (+ valor (* valor 0.1)))

;calculo mais soma do valor da multa 
(defn valor-total
  [valor]
  (let [percentual-multa 0.1]
    (+ valor (* valor porcentual percentual-multa))))

;calculo mais soma do valor da multa 
(defn valor-total
  [valor]
  (let [percentual-multa 0.1
        valor-multa (* valor porcentual percentual-multa)]
    (+ valor valor-multa)))

;calculo mais soma do valor da multa (com descrição(documentado))
(defn valor-total
   "Calcula o valor total incluindo a multa"
  [valor]
  (let [percentual-multa 0.1
        valor-multa (* valor porcentual percentual-multa)]
    (+ valor valor-multa)))

;predicado retorna valor booleano 
;retorna true se o valor é par false impar 
(even? 3)
;retorna false se o valor é par true impar 
(odd? 3)
;retorna true se o numero for negativo
(neg? 3) 

;predicado que retorna boleano sempre tem interogação no final do nome
;predicado(boleano) retorna true se o valor for menor que 1000s
(defn isento-imposto?
  [valor]
  (< valor 1000))

;(if(condição)
;  (expressåo para caso true)
;  (expressão para caso false))

; if é uma funcao de tem tres parametros e um retorno

; se salario for abaixo ou igual 1000 nao tem imposto 
; se for acima de 1000 e abaixo de 2000 tem 10% de imposto
; se for acima ou igual a 2000 tem 20% de imposto
(def imposto-retido
  [salario]
  (if(<= salario 1000)
    0
    (if(< salario 2000)
      (* salario 0.1)
      (* salario 0.2))))


; se salario for abaixo ou igual 1000 nao tem imposto 
; se for acima de 1000 e abaixo de 2000 tem 10% de imposto
; se for acima ou igual a 2000 tem 20% de imposto
(def imposto-retido
  [salario]
  (let [imposto-primeira-faixa 0
        imposto-segunda-faixa 0.1
        imposto-terceira-faixa 0.2])
  (if(<= salario 1000)
  imposto-primeira-faixa
    (if(< salario 2000)
      (* salario imposto-segunda-faixa)
      (* salario imposto-terceira-faixa))))

;exemplo de predicado 
(defn isento-de-imposto?
  [valor]
  (if (<= valor 1000)
    true
    false))

;simplificacão
(defn isento-de-imposto?
  [valor]
  (<= valor 1000))

;
(defn imprimir-mensagem-boas-vindas
  [idade]
  (when (>= idade 18) 
    (println "está mensagem sera exibida aprnas para uduarias")
    (println "com masi de 18 anos de idade.")))


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


;pega o valor de dentro do vetor 
(defn obtem-terceiro-nome
  [nomes]
  (get nomes 2 "Desconhecida"))

(obtem-terceiro-nome ["Marcio" "Maria"])


;pega o valor de dentro do vetor 
(defn substituir-primeiro-nome
  [nomes novo-primeiro-nome]
  (assoc nomes 0 novo-primeiro-nome))

(substituir-primeiro-nome ["Marcio" "joao" "Maria"] "jose")


(defn soma 
  [x y]
  (+ x y))

(defn imprime-some
  []
  (println (some 2 2 )))

