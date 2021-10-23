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
; % = parametro
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

;filter recebe dois parametros primeiro uma funcao em seguida o segundo parametro 
;valor que quero fazer a transformacao, valor a ser filtrado  

(defn esta-no-quinto-ano?
  [ano]
  (= ano 5))      ; (if (= ano 5)      ;Ou sem if  (= ano 5)
                  ;  true 
                  ;  false))

(defn quantidade-estudantes-no-quinto-ano
  [estudantes]
  (count (filter esta-no-quinto-ano? estudantes)))

(quantidade-estudantes-no-quinto-ano [5 6 7 5]);sem o conunt retorna (5 5)

(quantidade-estudantes-no-quinto-ano [5 6 7 5]);com o conunt retorna 2

;outro modo de fazer:
;utilizando funcao anonima

(defn quantidade-estudantes-no-quinto-ano
  [estudantes]
  (count (filter #(= 5 %) estudantes)))  ;ou (count (filter (fn [ano] (= 5 ano)) estudantes)))

;Desafio 2: crie uma funcao que recebe um vetor de idades e retorna a soma.
; ex: (soma-das-idades [5 10 5]); deve retornar 20

;reduse recebe dois parametros no qual o primeiro vai fazer  a acao entre os pares(exemoplo soma todos os valores) 
; aceita o valor 0 pu vazio
(defn soma-das-idades
  [idades]
  (reduce + idades))

(soma-das-idades [5 10 5]);retorna 20


;Desafio 3: crie uma funcao que recebe um vetor e retorne o tamanho dos nomes 
;EX: (tamanho-medio-dos-nomes ["marcio" "joao"]); deve retornar 5
;(map count nomes) retorna uma lista com seguinte valor (6 4)

(defn tamanho-medio-dos-nomes
  [nomes]
  (/ (reduce + (map count nomes)) (count nomes)))

(tamanho-medio-dos-nomes ["marcio" "joao"])

{} ;mapa vazio

;carrinho de compras
(defn compras 
  []
{:tomate {:quantidade 2 :preco 5}
 :arroz {:quantidade 1 :preco 4}
 :feijao {:quantidade 2 :preco 10}})

(get (compras) :tomate); retorna {:quantidade 2, :preco 5}
;ou
((compras) :tomate); retorna {:quantidade 2, :preco 5} /OBS não retorna NULL/NIL
;ou 
(:tomate (compras)); retorna {:quantidade 2, :preco 5}


(:preco (:tomate (compras)));retorna 5

(:quantidade (:tomate (compras)));retorna 2

(:batata (compras) {:quantidade 0 :preco 0}); caso não queira que retorne nulo o terceiro parametro dentro das{}


(conj (compras) {:alface {:quantidade 2 :preco 8} }); adiciona um valor no mapa / junta dois mapas(cria um novo e adiciona)

(assoc (compras)  :alface {:quantidade 2 :preco 8 });assoc é asociar um novo valor a chave/ ou edita o valor atual da chave  

(dissoc (compras) :tomate);dissoc desasocia uma chave / remove uma chave de valor 

{:nome "Marcio frayzer" :idade 39}

(inc 39); retorna o valor 40 (incrementa 1)

(update {:nome "Marcio Frazyzer", :idade 39} :idade inc);primeiro parametro a chave, segundo parametro o campo atualizado, terceiro pode ser um valor ou funcao
;retorna {:nome "Marcio Frazyzer", :idade 40}

;carrinho de compras
(defn compras 
  []
{:tomate {:quantidade 2 :preco 5}
 :arroz {:quantidade 1 :preco 4}
 :feijao {:quantidade 2 :preco 10}})

(update-in (compras) [:tomate :preco] inc); update-in atualiza um mapa dentro de outro apenas prencheno o vetor com a ordem dos mapas 
;retorna 
;{:tomate {:quantidade 2 :preco 5}
;;arroz {:quantidade 1 :preco 4}
;:feijao {:quantidade 2 :preco 10}}

(update-in (compras) [:tomate :preco] * 2); retorna :tomate {:quantidade 2 :preco 10}



;_____________________________________________________________________________________________________
  ;Desafio: precisamos criar uma função que, dada um conjunto (vetor)

  ; de disciplinas e o semestre da discente, deve:
  ;filtrar a lista para exibir disciplinas restantes (que sejam do semestre atual ou superior)
  ;transformar nome da disciplina para maiúsculo e descartar demais informações
  ;- criar uma String concatenando o nome de todas as disciplinas filtradas
  ;; Exemplo de entrada:
  ;;[{:nome "Estrutura de dados" semestre 2} 
  ;{:nome "Algoritmos" semestre 1}
  ;;{:nome "Inteligêncio Artificial" semestre 3}] 2
  ; Saída esperada: "ESTRUTURA DE DADOS, INTELIGENCIA ARTIFICIAL"

(defn disciplinas
  []
  [{:nome "Estrutura de dados" semestre 2} 
   {:nome "Algoritmos" semestre 1}
   {:nome "Inteligêncio Artificial" semestre 3}])

(:semestre {:nome "estrutura de dados" :semestre 2})

  (defn nomes-disciplinas-restantes
    [disciplinas semestre-atual]
    (filter #(>= (:semestre %) semestre-atual)disciplinas))

  (nomes-disciplinas-restantes (disciplinas) 1); retorna todos as disciplinas (igual ou maior que 1)

  (nomes-disciplinas-restantes (disciplinas) 2); retorna algumas disciplinas (igual ou maior que 2)


 (:semestre {:nome "estrutura de dados" :semestre 2})

 (defn nomes-disciplinas-restantes
  [disciplinas semestre-atual]
  (map (filter #(>= (:semestre %) semestre-atual) disciplinas)))

  (nomes-disciplinas-restantes (disciplinas) 2);retorna algumas disciplinas (igual ou maior que 2)(somente o nome)

(clojure.string/upper-case "Estrutura de dados"); retorna a string em maiusculo (tem que importar )


(defn nomes-disciplinas-restantes
  [disciplinas semestre-atual]
  (map clojure.string/upper-case (map (filter #(>= (:semestre %) semestre-atual) disciplinas))))

  (nomes-disciplinas-restantes (disciplinas) 2);retorna uma lista de disciplinas (igual ou maior que 2)(somente os nome e em maiusculo)

(clojure.string/join ", "["ESTRUTURA DE DADOS" "INTELIGENCIA ARTIFICIAL"]);join concatena(junta) os valores da lista e coloca um valor entre eles (tem que importar) 
;retorna "ESTRUTURA DE DADOS, INTELIGENCIA ARTIFICIAL"

;exemplo de importacao todas as funcoes 
;(ns selft-testing-code.core
; (:require [clojure.string :refer :all ]))
;
;exemplo de importacao todas apenas duas funcoes(upper-case e join) pode remover o caminho do codigo
;(ns selft-testing-code.core
; (:require [clojure.string :refer [upper-case join]]))

(defn nomes-disciplinas-restantes
  [disciplinas semestre-atual]
  (clojure.string/join ", " (map clojure.string/upper-case (map (filter #(>= (:semestre %) semestre-atual) disciplinas)))))

;____________________________________________________________________________________________
; REFATORACAO

;Threading last
;->> = Threading é simplificacao de quando tem uma funcao dentro de uma funcao, coloca dentro do Threading em lista cada funcao 
; e sequenciamente o resuntado passa como paramentro para o proxima funcao 
(defn nomes-disciplinas-restantes
  [disciplinas semestre-atual]
  (->> disciplinas 
    (filter #(>= (:semestre %) semestre-atual))
    (map :nome)
    (map upper-case)
    (join ", ")))

;Threading first
;-> 

;antes 
(defn transform[person]
  (update (assoc person :hair-color :gray) :age inc))
;refatorado
(defn transform [person]
  (-> person 
    (assoc :hair-color :gray )
    (update :age inc)))