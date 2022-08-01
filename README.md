# santander-java-dio
Conteudo do módulo 4 - Java do BootCamp Santander 2022 ministrado na plataforma DIO

# ESTRUTURAS DE REPETIÇÃO E ARRAYS COM JAVA

Resolução dos exercícios propostos: **ESTRUTURAS DE REPETIÇÃO E ARRAYS NA LINGUAGEM JAVA**. Curso este que tive a honra de co-criar com a plataforma de cursos online **[DIGITAL INNOVATION ONE ](https://web.digitalinnovation.one/home)**🧡💛 e disponibilizado de forma gratuita para a comunidade dos desenvolvedores Java.

## 🛑 Pré-requistos

-  Java JDK 11
-  IDE para desenvolvimento Java
-  Conhecer a sintaxe Java

## 📚 Ementa

Ao assistir este curso, Dev será capaz de entender na prática como trabalhar com as estruturas de repetição (while/do-while/for) e arrays. Se tratando de arrays, também vamos conhecer a estrutura foreach.

👀 [Visão geral: Estruturas de Repetição e Arrays](https://docs.google.com/presentation/d/1G3MDuxTjdEGcDBguVoanbP9-xipy8v46/edit?usp=sharing&ouid=114707527529839266022&rtpof=true&sd=true)

➿ [Exercícios Loops](https://github.com/cami-la/loops-e-arrays/tree/master/src/br/com/dio/exercicios/loops)

⛓ [Exercícios Arrays](https://github.com/cami-la/loops-e-arrays/tree/master/src/br/com/dio/exercicios/arrays)

## ➿ ESTRUTURAS DE REPETIÇÃO

🔸 O real poder dos computadores está na sua habilidade para repetir uma operação ou uma série de operações várias vezes (*loop*).
🔸 **Uma estrutura de repetição permite que uma sequência de comandos seja executada repetidamente, caso determinadas condições são satisfeitas.**
🔸 Essas condições são representadas por expressões lógica.
🔸 As estruturas de repetição podem ser classificadas em:

-  Repetição com teste no início (*while*)
-  Repetição com teste no final (*do-while*)
-  Repetição contada (*for*)

🔸O comando *break* é utilizado para terminar de forma abrupta uma repetição.
🔸Quando comando *continue* é executado, os comandos restantes da repetição são ignorados e programa volta a testar novamente a condição.

### 📊 FLUXOGRAMAS

[![Screenshot-from-2021-08-25-09-44-42](https://camo.githubusercontent.com/cf76bc1988097966f1667f1f439851df2b534bf8dc10db30b8e9a8dd9d5890c4/68747470733a2f2f692e6962622e636f2f676a58707862742f53637265656e73686f742d66726f6d2d323032312d30382d32352d30392d34342d34322e706e67)](https://camo.githubusercontent.com/cf76bc1988097966f1667f1f439851df2b534bf8dc10db30b8e9a8dd9d5890c4/68747470733a2f2f692e6962622e636f2f676a58707862742f53637265656e73686f742d66726f6d2d323032312d30382d32352d30392d34342d34322e706e67)

### ➕/➖ OPERADORES DE INCREMENTO E DECREMENTO

[![Screenshot-from-2021-08-23-10-56-10](https://camo.githubusercontent.com/31185720a651c983a2c8bc6a6dab58c07706f205c30e1f86d5efdff0a392dafa/68747470733a2f2f692e6962622e636f2f475462394a4e622f53637265656e73686f742d66726f6d2d323032312d30382d32332d31302d35362d31302e706e67)](https://camo.githubusercontent.com/31185720a651c983a2c8bc6a6dab58c07706f205c30e1f86d5efdff0a392dafa/68747470733a2f2f692e6962622e636f2f475462394a4e622f53637265656e73686f742d66726f6d2d323032312d30382d32332d31302d35362d31302e706e67)

### 🧮 OPERAÇÕES ARITMÉTICAS

[![Screenshot-from-2021-08-23-10-56-24](https://camo.githubusercontent.com/e26713c9a0c355b96a5f9c77ba5647ae4ea87c760950810423f8fe650535db9b/68747470733a2f2f692e6962622e636f2f59516d625373562f53637265656e73686f742d66726f6d2d323032312d30382d32332d31302d35362d32342e706e67)](https://camo.githubusercontent.com/e26713c9a0c355b96a5f9c77ba5647ae4ea87c760950810423f8fe650535db9b/68747470733a2f2f692e6962622e636f2f59516d625373562f53637265656e73686f742d66726f6d2d323032312d30382d32332d31302d35362d32342e706e67)

#### EXTRA:

**FLUXO DE EXECUÇÃO ARBRITÁRIO: \*goto\***

🔸O comando *goto* tem por finalidade desviar a execução do programa para qualquer outro ponto do programa, desconsiderando qualquer estrutura de repetição ou estrutura condicional.
🔸Ao contrário de C/C++, Java não tem instrução *goto*, mas java oferece suporte a *label*.

🔗 https://www.geeksforgeeks.org/g-fact-64/
🔗 https://www.tutorialspoint.com/How-to-use-labels-in-Java-code

------

### 💭 EXERCÍCIOS ESTRUTURAS DE REPETIÇÃO

### *📝 WHILE*

**🔸Nome e Idade:** Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome)

**🔸Nota:** Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

### *📝 DO-WHILE*

**🔸Maior e Média:** Faça um programa que leia 5 números e informe o maior número e a média desses números.

**🔸Par e Ímpar:** Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade de números impares.

### *📝 FOR*

**🔸Tabuada:** Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50

**🔸Fatorial:** Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120

🔗 [Lista de Exercícios Estruturas de Repetição](https://wiki.python.org.br/EstruturaDeRepeticao) - [Possíveis Soluções](https://github.com/cami-la/listaDeExerciciosPythonBrasil/tree/master/estruturaDeRepeticao)

------

## ⛓️ ARRAYS

🔹 Array é um objeto utilizado para armazenar sequencialmente dados do mesmo tipo.
🔹 Permanecem com o mesmo tamanho depois de criados.

[![Screenshot-from-2021-08-25-09-11-48](https://camo.githubusercontent.com/d5233e85dfcec0b68ac41226193ea5ad9d81b68e953d2f1478da268e0621805b/68747470733a2f2f692e6962622e636f2f4756515643346b2f53637265656e73686f742d66726f6d2d323032312d30382d32352d30392d31312d34382e706e67)](https://camo.githubusercontent.com/d5233e85dfcec0b68ac41226193ea5ad9d81b68e953d2f1478da268e0621805b/68747470733a2f2f692e6962622e636f2f4756515643346b2f53637265656e73686f742d66726f6d2d323032312d30382d32352d30392d31312d34382e706e67)

------

### 💭 EXERCÍCIOS ARRAYS

### *📝 ARRAYS UNIDIMENSIONAIS*

**🔹Ordem Inversa:** Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.

**🔹Consoantes:** Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.

**🔹Números Aleatórios:** Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor. Ao final, mostre os números e seus sucessores.

🔗 [Lista de Exercícios Arrays Unidimensionais ](https://wiki.python.org.br/ExerciciosListas)- [Possíveis soluções](https://github.com/cami-la/listaDeExerciciosPythonBrasil/tree/master/exerciciosListas)

### *📝 ARRAYS MULTIDIMENSIONAIS*

**🔹Array Multidimensional:** Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine o menor número da matriz e a sua posição(linha, coluna).

🔗 [Lista de Exercícios Arrays Multidimensionais](https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-20?from_action=save)

------

## 🔎 Referências Bibliográficas

🔗 https://www.ic.unicamp.br/~wainer/cursos/2s2011/Cap06-RepeticaoControle-texto.pdf
🔗 http://www2.ic.uff.br/~vanessa/material/prog1/Aula6.pdf
🔗 http://www.facom.ufu.br/~backes/gsi002/Aula05-ComandosRepeticao.pdf
🔗 https://blog.grancursosonline.com.br/java-operadores-de-incremento-e-decremento/
🔗 [http://www.facom.ufu.br/~bacala/POO/04%20-%20Arrays%20em%20Java.pdf](http://www.facom.ufu.br/~bacala/POO/04 - Arrays em Java.pdf)
🔗 http://www.inf.ufsc.br/~frank.siqueira/INE5404/7.Arrays.pdf

## 🤝 Contribuindo

Este repositório foi criado para fins de estudo, então contribua com ele.
Se te ajudei de alguma forma, ficarei feliz em saber. E caso você conheça alguém que se identidique com o conteúdo, não deixe de compatilhar.

Se possível:

⭐️ Star o projeto

🐛 Encontrar e relatar issues

------

Disponibilizado com ♥ por [cami-la](https://www.linkedin.com/in/cami-la/).
