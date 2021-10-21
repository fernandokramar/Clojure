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

;retorna o tipo do objeto
(type 10 );Long
;ou
(class 10)

(type 10.0);double

(type (/ 10 3)) ;ratio

(type (* 3 (/ 10 3)));bigint

(type 10N);bigint

(type 10N);bigDecimal

;nome padrao para os arquivos é logic.clj

(defn consulta-taxa-padrao-por-http
  "imagina que este codigo faz uma resquisição http para obter a taxa-padrao"
  []
  0.20)

(defn imposto-retido
  "Se o salario de 1000 reais nao tem imposto. Acima ou igual a 1000 deve aplicar"
   [taxa-padrao salario]
   (if (< salario 1000)
   0
   (* salario taxa-padrao)))

  (imposto-retido (consulta-taxa-padrao-por-http) 10) 
    ; ou 
  (imposto-retido 0.20 10) 

 (defn imposto-retido
  "Se o salario de 1000 reais nao tem imposto. Acima ou igual a 1000 deve aplicar"
  [consulta-taxa-padrao salario]
  (if (< salario 1000)
  0
  (* salario (consulta-taxa-padrao)))
        
(defn consulta-taxa-padrao-fixa
  []
  0.10)

(imposto-retido consulta-taxa-padrao-por-http 10) 
(imposto-retido consulta-taxa-padrao-fixa 10) 

(defn minha-taxa-padrao
  []
  consulta-taxa-padrao-fixa)

(minha-taxa-padrao)

(imposto-retido (minha-taxa-padrao) 2000)



(defn escolhe-consulta-taxa-padrao
  [ambiente]
  (if (= ambiente :teste)
  consulta-taxa-padrao-fixa
  consulta-taxa-padrao-por-http))

(imposto-retido(escolhe-consulta-taxa-padrao :producao) 1000)

;funcao anonima (sem nome)
((fn [x] (* 2 x)))
;ou
(#(* 2 %) 5)

(#(+ % %) 2)

((fn [x y] (+ x y)) 6 7)

(#(+ %1 %2) 8 9)

;sempre retorna o valor do constantly 
((constantly 0.2) 5 3 10)


(imposto-retido (fn [] 0.7) 2000)

(imposto-retido (constantly 0.7) 2000)

;____________________________________________________________________________________________

;quantidade de estudante do 5 ano

;Imagina que tenhamos um vetor de numeros onde cada numero representa o ano que o estudante está.
;exemplo : [5 6 6] 
;Temos 1 estudante do quinto ano e dois no sexto

;Desafio 1: crie uma funcao que recebe este vetor como entrada 
;retorna a quantidade de estudante que estão no quinto ano 



