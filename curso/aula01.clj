(println "welcome to the system")

;simbolo = variavel 
;definindo o simbolo total-de-produto = 15 
(def total-de-produtos 15) 
;#'user/total-de-produtos(user é espaço de memoria no qual estamos trabalhando(name espace))

;imprime o valor simbolo 
(println total-de-produtos)

;println pode receber mais que um parametro 
(println "Total" total-de-produtos)

;redefinindo o valor do simbolo
(def total-de-produtos 13) 
 
;operação antes dos parametros
(+ 13 3)
 
;definindo o simbolo = a soma do simbolo + 3 
(def total-de-produtos(+ total-de-produtos 3))

;define o simbolo = vetor dentro do colchetes(não precisa de virgula)", = "espaço"
(def estoque ["Mochila", "Camiseta"])

; chama o primeiro elemento do vetor
(estoque 0)

; chama o segundo elemento do vetor
(estoque 2)

; conta a quantidade dentro do vetor 
(count estoque)

;adiciona mais um valor no vetor mas não altera o vetor original 
(conj estoque "Cadeira")

;define o simbolo = vetor adiciona mais um valor no vetor e altera o vetor original 
(def estoque (conj estoque "Cadeira"))

__________________________________________________________________________________________

;criando uma função 
(defn imprime-mensagem []
  (println "____________________")
  (println "Bem-vindo ao estoque"))

;criando uma função 
(defn aplica-desconto 
    [valor-bruto]
    (* valor-bruto 0.9))
;chamando a função  
(aplica-desconto 100)

;criando uma função 
(defn valor-descontado 
    "Retorna o valor descontado que é 90% do valor bruto"
    [valor-bruto]
    (* valor-bruto 0.9))
;chamando a função
(valor-descontado  100)

;outra forma de criar a função de cima
(defn valor-descontado
    "Retorna o valor com desconto de 10%."
    [valor-bruto]
    (* valor-bruto (- 1 0.10)))
;chamando a função
(valor-descontado 100)