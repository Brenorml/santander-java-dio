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

# Curso Introdutório Collections Java

Resolução dos exercícios propostos: **CURSO INTRODUTÓRIO COLLECTIONS FRAMEWORK JAVA**. Curso este que tive a honra de co-criar com a plataforma de cursos online **[DIGITAL INNOVATION ONE ](https://web.digitalinnovation.one/home)**🧡💛 e disponibilizado de forma gratuita para a comunidade dos desenvolvedores Java.

⚠️ Não estou disponibilizando o link direto para o curso, já que o mesmo faz parte da trilha de alguns Bootcamps como por exemplo da GFT. Logo, você terá que se matricular no Bootcamp para ter acesso ao curso. ⚠️



[List ](https://github.com/cami-la/curso-dio-intro-collections/tree/master/src/br/com/dio/collection/list)• [Set ](https://github.com/cami-la/curso-dio-intro-collections/tree/master/src/br/com/dio/collection/set)• [Map](https://github.com/cami-la/curso-dio-intro-collections/tree/master/src/br/com/dio/collection/map) • [Stream API](https://github.com/cami-la/curso-dio-intro-collections/tree/master/src/br/com/dio/collection/streamAPI)
👍 ***Todos os exercícios resolvidos*** 👍

## 🛑 Pré-requistos

-  Java JDK 11
-  IDE IntelliJ
-  Conhecer a sintaxe Java
-  Noção acerca do Paradigma de Programação Orientada a Objeto
-  Disposição para estudar

## 📚 Ementa

🔸 **Visão geral: Java Collections Framework e hierarquia**

🔸 **List**
Coleção com iterações ordenadas: List
Conhecendo os métodos
Ordenação da coleção List

🔸 **Set**
Coleção com singularidade: Set
Conhecendo os métodos
Ordenação da coleção Set

🔸 **Map**
Coleção de pares: Map
Conhecendo os métodos
Ordenação de Map

🔸 **Stream API**
Visão geral: Classe Anônima - Functional Interface - Lambda - Method Reference
Stream API
Conhecendo as operações

## 🤝 Contribuindo

Este repositório foi criado para fins de estudo, então contribua com ele. Se te ajudei de alguma forma, ficarei feliz em saber. E caso você conheça alguém que se identidique com o conteúdo, não deixe de compatilhar.

Se possível:

⭐️ Star o projeto

🐛 Encontrar e relatar issues

------

# TRATAMENTO DE EXCEÇÕES EM JAVA

Curso que apresenta conceitos introdutórios sobre como podemos identificar e tratar Exceptions na linguagem Java. Curso este ministrado por mim em nome da **[DIGITAL INNOVATION ONE ](https://web.digitalinnovation.one/home)**🧡💛 e disponibilizado de forma gratuita para a comunidade dos desenvolvedores Java.

## 🛑 Pré-requistos

-  Java JDK 8 ou superior
-  IDE para desenvolvimento Java
-  Conhecimento BÁSICO em OOP
-  Estar disposto a aprender

## 📚 Ementa

1. Visão Geral
2. Unchecked Exception
3. Checked Exception
4. Exception Personalizada

## Visão Geral

- Exceção é um evento que interrompe o fluxo normal de processamento de uma classe.
- O uso correto de exceções torna o programa mais robusto e confiável.
- Com o tratamento de exceções, um programa pode continuar executando depois de lidar com um problema.
- *Importante:* Incorpore sua estratégia de tratamento de exceções no sistema desde o princípio do processo de projeto. Pode ser difícil incluir um tratamento de exceções eficiente depois que um sistema foi implementado.

### Error:

Usado pela JVM que serve para indicar se existe algum problema de recurso do programa, tornando a execução impossível de continuar.

### Unchecked (Runtime):

Exceptions que PODEM ser evitados se forem tratados e analisados pelo desenvolvedor.

### Checked Exception:

Exceptions que DEVEM ser evitados etratados pelo desenvolvedor para o programa funcionar.

[![amoTu](https://camo.githubusercontent.com/d1bf9cf0c3cad0eb3a5f28f4300d8857f478b6032b3f37bb2713712c03fca0f2/68747470733a2f2f692e6962622e636f2f566a54323352722f616d6f54752e706e67)](https://camo.githubusercontent.com/d1bf9cf0c3cad0eb3a5f28f4300d8857f478b6032b3f37bb2713712c03fca0f2/68747470733a2f2f692e6962622e636f2f566a54323352722f616d6f54752e706e67)

Hierarquia Exceptions

## Palavras Reservadas:

- try, catch, finally: Cada uma dessas palavras, juntas, definem blocos para o tratamento de exceções.
- throws: Declara que um método pode lançar uma ou várias exceções.
- throw: Lança explicitamente uma exception.

------

## 🔸 Error

- Usado pela JVM, serve para indicar quando existe algum problema de recurso do programa, tornando a execução impossível de continuar.
- O “Erro” é algo que não pode mais ser tratado, ao contrário da “Exceção” que trata seus erros, pois todas as subclasses de Exception (menos as subclasses RuntimeException) são exceções que obrigatóriamente devem ser tratadas.

## 🔸 Unchecked Exception

- Herdam da classe *RuntimeException* ou da classe *Error*.
- O compilador não verifica o código para ver se a exceção foi capturada ou declarada.
- Se uma exceção não-verificada ocorrer e não tiver sido capturada, o programa terminará ou executará com resultados inesperados.
- Em geral, podem ser evitadas com uma codificação adequada.

## 🔸 Checked Exception

- As exceções que são herdadas da classe *Exception*, mas não de *RuntimeException*.
- O compilador impõe um requisito do tipo "capturar ou declarar".
- O compilador verifica cada chamada de método e declaração de método para determinar se o método lança (*throws*) exceções verificadas.
- Se lançar, o compilador assegura que a exceção verificada é capturada ou declarada em uma cláusula *throws*.
- Caso não capturada nem declarada, ocorre um erro de compilação.

## 🔸 Exception Personalizada

- Programadores podem achar útil declarar suas próprias classes de exceção.
- Essas Exceptions são específicas aos problemas que podem ocorrer quando outro programador empregar suas classes reutilizáveis.
- Uma nova classe de exceção deve estender uma classe de exceção existente que assegura que a classe pode ser utilizada com o mecanismo de tratamento de exceções, logo essas Exceções customizadas são derivadas da classe Exception.
- *Importante*: Antes de criar a nossa própria exceção, é recomendado verificar se já existe alguma exceção na biblioteca Java que já nos forneça o que precisamos. Afinal, não queremos reinventar a roda!

## 🔸 Blocos try/catch/finally

- Bloco

-  

- *try*

- :

- Região onde se encontra o código que queremos verificar se irá ou não lançar uma exceção.
- Caso ocorra uma exceção em algum ponto, o restante do código contido no bloco *try* não será executado.
- O bloco *try* não pode ser declarado sozinho, por tanto, precisa estar seguido de um ou vários blocos *catch* e/ou de um bloco *finally*.

- Bloco

-  

- *catch*

- :

- Região onde se encontra o possível tratamento da exceção. Isso significa que só será executado caso o bloco *try* apresentar alguma exceção.
- Recebe como argumento a classe ou subclasse da possível exceção.
- No seu escopo ficam as instruções de como tratar essa exceção.
- Pode haver mais de um bloco *catch*, porém, será executado apenas o primeiro bloco que identificar a exceção.
- *Importante*: Caso você utilize mais de um *catch* e houver exceções de uma mesma hierarquia de classes, certifique-se que a classe mais genérica esteja como argumento do último *catch*. Caso contrário, qualquer exceção sempre cairá neste primeiro *catch*, assim fazendo com que a exception mais específica não seja verificada.

- Bloco

-  

- *finally*

- :

- Este bloco é opcional, mas caso seja construído, quase sempre será executado. (A menos que seja forçada sua parada, por exemplo, com um System.exit(0), no *catch*)
- Dentro do bloco *finally*, poderá conter outros blocos *try, catch,* bem como outro *finally*.
- Geralmente utilizado quando precisamos executar algum código independente se ocorrer exception ou não.

## 🔸 Cláusulas throws e throw

- Cláusula

-  

- *throws*

- Usada na assinatura do método.
- Necessária apenas para exceções checked.
- Informa ao chamador que este método pode lançar uma das exceções listadas no escopo do método. Isso obriga a fazer a captura dessa exception (*try-catch*) ou relançar o *throws*.

- Cláusula

-  

- *throw*

- É usada para lançar explicitamente uma exceção de um método ou de qualquer bloco de código.
- Usada principalmente para lançar exceções personalizadas
- Importante

- :

- O fluxo de execução "normal" do programa para imeditamente apos a execução da cláusula *throw*. O bloco *try* envolvente mais próximo é verificado para encontrar um bloco *catch* que corresponda ao tipo de exceção.
- Caso encontre essa correspondência, o controlado é transferido para esse bloco. Caso contrário, o próximo bloco *try* envolvente é verificado e assim por diante.
- Outro caso, é se nenhuma captura for encontrada, o manipulador da exceção padrão interromperá o programa.

## 🔗 Referências

- https://www.devmedia.com.br/trabalhando-com-excecoes-em-java/27601
- https://www.youtube.com/watch?v=ld2C4GcAtsg&t=296s
- https://www.programcreek.com/2009/02/diagram-for-hierarchy-of-exception-classes/
- https://www.projetojavaweb.com/certificado-aluno/plataforma-curso/aulaatual/467726283/idcurso/1/idvideoaula/161
- https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Error.html
- https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html
- https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html
- https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html

## 🤝 Contribuindo

Este repositório foi criado para fins de estudo, então contribua com ele.
Se te ajudei de alguma forma, ficarei feliz em saber. E caso você conheça alguém que se identidique com o conteúdo, não deixe de compatilhar.

Se possível:

⭐️ Star o projeto

🐛 Encontrar e relatar issues

------

# Debugging Java

Curso que apresenta conceitos introdutórios sobre como podemos trabalhar com debugging na linguagem Java. Curso este ministrado por mim em nome da **[DIGITAL INNOVATION ONE ](https://web.digitalinnovation.one/home)**🧡💛 e disponibilizado de forma gratuita para a comunidade dos desenvolvedores Java.

## 🛑 Pré-requistos

-  Java JDK 8 ou superior
-  IDE para desenvolvimento Java

## 📚 Ementa

1. Visão Geral
2. Pilha de Execução de um programa Java

## Visão Geral

Erros de programação são denominados bugs e o processo de encontrar e corrigir bugs é chamado de depuração ou debugging.

De forma geral, a depuração é uma tarefa difícil e trabalhosa, e a dificuldade varia de acordo com o ambiente de desenvolvimento, o que inclui a linguagem de programação e as ferramentas disponíveis, como depuradores.

Existem duas grandes categorias que englobam a natureza do erro:

- ### Erros de Sintaxe:

  É um erro nas regras estabelecidas da linguagem:

  1. Parênteses, chaves, colchetes que abrem mas não fecham.
  2. Duas instruções sem um ponto-e-vírgula entre elas;
  3. Uma palavra-chave sendo usada numa posição inesperada.

- ### Erros de Semântica:

  É um erro na "lógica do código", em sua semântica, o código está sintaticamente correto, porém não faz o que se esperava dele.

  1. Tentar dividir um número por uma String ou por zero.
  2. Atribuir um valor incoerente a um tipo de dado.
  3. Tentar fechar um arquivo que não foi aberto.

[![img](https://camo.githubusercontent.com/e941a554304a17e5fb53696e1d232d2aa5b891bc0893bcbb15393356883a9aac/68747470733a2f2f6d65646961312e67697068792e636f6d2f6d656469612f396f396468314a524754684331717847544a2f67697068792e6769663f6369643d65636630356534376534656736686878336b7531736563336a35356336313670333173676e36336d366b66306b636d75267269643d67697068792e6769662663743d67)](https://camo.githubusercontent.com/e941a554304a17e5fb53696e1d232d2aa5b891bc0893bcbb15393356883a9aac/68747470733a2f2f6d65646961312e67697068792e636f6d2f6d656469612f396f396468314a524754684331717847544a2f67697068792e6769663f6369643d65636630356534376534656736686878336b7531736563336a35356336313670333173676e36336d366b66306b636d75267269643d67697068792e6769662663743d67)

## Depuração/Debugging

Linguagens de alto nível tornam a depuração mais fácil, pois fornecem mais ferramentas para identificar erros, como o tratamento de exceções.

Os depuradores funcionam assumindo o controle do tempo de execução de um programa e permitindo que você o observe e controle. Para fazer isso, ele mostra a pilha do programa e permite que você a atravesse em qualquer direção. Quando você está em um depurador, obtém uma imagem mais completa de um quadro de pilha do que quando olha os rastreamentos de pilha em uma mensagem de log.

## Pilha de Execução de um Programa Java/Stack Trace



### Pilha de Execução:

Toda invocação de método é empilhada em uma estrutura de dados que isola a área de memória de cada um. Quando um método termina (retorna), ele volta para o método que o invocou.





### Stack Trace:

É a matriz onde encontramos a pilha de excecução da exceção. Em outras palavras, podemos dizer que o rastreamento da pilha busca (rastreio) para a próxima linha onde a exceção pode surgir.



## 🔗 Links Úteis

- https://confluence.jetbrains.com/display/IntelliJIDEA/14.+Depurador
- https://www.eclipse.org/community/eclipse_newsletter/2017/june/article1.php

## 🔎 Referências

- https://www.hostgator.com.br/blog/debug-desenvolvimento-web/
- https://www.alura.com.br/conteudo/java-excecoes
- [https://pt.wikipedia.org/wiki/Depura%C3%A7%C3%A3o](https://pt.wikipedia.org/wiki/Depuração)
- https://www.sentinelone.com/blog/java-stack-trace-understanding/
- https://www.caelum.com.br/apostila-java-orientacao-objetos/excecoes-e-controle-de-erros#exercicio-para-comecar-com-os-conceitos

## ✨ ️Redes Socias

[YouTube](https://www.youtube.com/channel/UCqchrwxLd023IrA8KlCpH9g) ▪️ [Instagram 1](https://www.instagram.com/estudant.i/) ▪️ [Instagram 2](https://www.instagram.com/camimi_la/) ▪️ [LinkedIn](https://www.linkedin.com/in/cami-la/)

## 🤝 Contribuindo

Este repositório foi criado para fins de estudo, então contribua com ele. Se te ajudei de alguma forma, ficarei feliz em saber. E caso você conheça alguém que se identidique com o conteúdo, não deixe de compatilhar.

Se possível:

⭐️ Star o projeto

🐛 Encontrar e relatar issues

------

# Dominando IDEs Java

Sejam bem-vindos ao curso **DOMINANDO IDEs JAVA** oferecido gratuitamente pela plataforma de cursos online [**Digital Innovation One**](https://web.digitalinnovation.one/). 🧡💛

▶️ [Como criar um Access Token para se conectar com o GitHub](https://www.youtube.com/watch?v=wcIm916zk9w&lc=UgwDmJkoCf5M9Pf66ll4AaABAg)

## 🚦 Guia

🔹 Começaremos passando rapidamente sobre o Java e algumas das suas características mais importantes
🔹 Em seguida, entraremos nas instalações do Java e das IDEs nos diferentes sistemas operacionais: Windows e Linux
🔹 E seguiremos até o final do curso explicando de uma forma leve e objetiva sobre umas das IDEs mais conhecidas para desenvolvimento Java: Eclipse IDE e IntelliJ IDEA IDE

*⚠️ Lembrando que o **foco do curso são as IDEs** e não a linguaguem Java. Ok? ⚠️*

## 🛑 Pré-requistos

-  Sistema operacional (Windows e/ou Linux)
-  Conta no GitHub

## 📚 Ementa

### **▪️ Instalação/Configuração do Java**

✅ Um pouco da história do Java
✅ Diferença entre JRE e JDK
✅ Versões do Java
✅ Se não existisse IDE?

### **▪️ Ubuntu**

✅ Instalação OpenJDK
✅ Configuração de variável de ambiente
✅ Instalação do Eclipse
✅ Configurando o ícone no Dock
✅ Instalação do IntelliJ

### **▪️ Windows**

✅ Instalação OpenJDK
✅ Configuração de variável de ambiente
✅ Instalação do Eclipse
✅ Instalação do IntelliJ

### **▪️ IntelliJ** 

✅ Diferenças entre versões
✅ Conhecendo um pouco por dentro da IDE
✅ Criando seu primeiro projeto Java no IntelliJ
✅ Atalhos e Produtividade
✅ Conectar seu projeto no GitHub

### **▪️ Eclipse** 

✅ Diferenças entre versões
✅ Conhecendo um pouco por dentro da IDE
✅ Criando seu primeiro projeto Java no IntelliJ
✅ Atalhos e Produtividade
✅ Conectar seu projeto no GitHub

###  **▪️ Outras Alternativas** 

✅ Visual Studio Code





## **🐧 LINUX**

### 🔺 Instalação OpenJDK

***O OpenJDK (Kit de Desenvolvimento Java Aberto)** é uma implementação gratuita e de código aberto da linguagem de programação Java. A implementação está licenciada sob a GNU General Public License (GPL) com uma exceção de vinculação. **JDK = JRE + JVM***

🔸 **1.** Abra o terminal e vamos verificar se temos o Java instalado:

```
java -version
```

🔸 **2.** Para instalar o openJDK-11, digite no terminal: *A versão mais atual LTS é do Java 11, que terá seu suporte estendido até Setembro de 2022. Este tipo de suporte iniciou no Java 8 que será mantido até 2023.*

```
sudo apt-get install openjdk-11-jdk
```

🔸 **3.** Confirme se realmente foi instalado com sucesso:

```
java -version
```

🔸**4.** Vamos configurar o ambiente JAVA_HOME:

 **4.1** Verificar o caminho da instalação do Java:

```
sudo update-alternatives --config java
```

 **4.2** Copie o caminho que aparecerá no terminal, no meu caso:

```
/usr/lib/jvm/java-11-openjdk-amd64/bin/java
```

 **4.3** Vamos editar o arquivo .bashrc:

```
sudo gedit ~/.bashrc
```

 **4.4** Copie o código abaixo e cole no final do arquivo .bashrc.

 *IMPORTANTE: cuidado para não alterar nada no arquivo além de apenas colar no final do mesmo o que vou te disponibilizar a seguir.*

 *JAVA_HOME = aqui você coloca o caminho do tópico 4.2, tirando o /bin/java*

```
JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
export JAVA_HOME
export PATH=$PATH:$JAVA_HOME
```

 **4.3** Salve o arquivo

 **4.4** Vamos conferir se a alteração ficou salva:

```
cat ~/.bashrc
```

🔸**5.** Feche o terminal e abra novamente

🔸**6.** Vamos conferir mais uma vez se o Java está instalado na nossa máquina

```
java --version
```

*Créditos: [DevSuperior](https://www.youtube.com/watch?v=jARiy3DZdwg)*



### 🔺 Instalação Eclipse

🔸 **1.** Entre no site oficial do Eclipse Foundation e faça o **[DOWNLOAD](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2021-06/R/eclipse-inst-jre-linux64.tar.gz)** *O site já identifica o sistema operacional.*

🔸 **2.** Descompacte a pasta

🔸 **3.** Procure o arquivo eclipse-inst e execute

🔸 **4.** Escolha segunda a opção: Eclipse IDE for Enterprise Java and Web Developers

🔸 **5.** Clique no folder da primeira opção e selecione o JDK que instalamos na nossa máquina.

🔸 **6.** Mantenha as opções "create start menu entry" e "create desktop shortcut"

🔸 **7.** Install

🔸 **8.** Accept now

🔸 **9.** Launch

🔸 **10.** Pronto, intalação concluída!



### 🔺 Configurando o ícone do Eclipse IDE no Dock



### 🔺 Instalação IntelliJ IDEA Community

🔸 **1.** Entre no site ofical do [**INTELLIJ**](https://www.jetbrains.com/idea/download/#section=windows)

🔸 **2.** Escolha a opção Community e faça o download

🔸 **3.** Descompacte a pasta e vamos para o terminal

🔸 **4.** Abra o terminal (Ctrl + Alt + t) e entre no diretório que você descompactou *No meu caso, na pasta Downloads Ideal*

```
cd Downloads/IdealC
```

🔸 **5.** Entre na pasta bin

```
cd bin
```

🔸 **6.** Execute o arquivo de instalação idea.sh

```
./idea.sh
```



### 🔺 Instalação Git

🔸 **1.** Abra o terminal (Ctrl + Alt + t) e vamos verificar se temos o git instalado:

```
git --version
```

🔸 **2.** Execute o comando:

```
sudo apt-get install git-all
```

🔸**3.** Confirme novamente se o git realmente está instalado:

```
git --version
```

🔸 **4.** Vamos começar as configurações iniciais:

 **4.1** Cofigurar o nome de usuário

```
git config --global user.name "Seu nome"
```

 **4.2** Configurar o endereço de e-mail: *É de suma importância que o ENDEREÇO DE E-MAIL SEJA O MESMO DO GITHUB afim de evitar conflitos!*

```
git config --global user.email seuemail@email.br
```

 **4.3** Vamos conferir a lista de configurações:

```
git config --list
```

🔸 **5.** Pronto, git instalado e configurado com sucesso!





## **🪟 WINDOWS**

### 🔺 Instalação JDK Zulu

Aqui no windows, vamos fazer o download do **OpenJDK Zulu**. *As compilações do Azul Zulu do OpenJDK são compilações de código aberto, testadas pelo TCK e certificadas do OpenJDK. O Zulu Blue está disponível para uma ampla variedade de plataformas de hardware e sistemas operacionais. A documentação do Azul Zulu inclui notas de lançamento, um guia de instalação e licenças de terceiros.*

🔹 **1.** Entre no [**SITE AZUL**](https://www.azul.com/downloads/?package=jdk)

🔹 **2.** Faça o download do arquivo .zip do JDK 11.0.11+9. No meu caso, o x86 64-bit

🔹 **3.** Vá no drive C://Arquivo de Programas

🔹 **4.** Caso não tenha um diretório com o nome Java, crie

🔹 **5.** Entre neste diretório e descompacte o download do zip JDK Zulu 11.0.11+9 neste diretório

🔹 **6.** Vamos configurar o ambiente JAVA_HOME:

 **6.1** Menu iniciar -> Editar as varáveis de ambiente do sistema

 **6.2** Irá abrir a janela Propriedades do Sistema, escolha a aba Avançado, em seguida clique em variáveis de Ambiente

 **6.3** Na janela Variáveis de Ambiente, crie um novo Variáveis do sistema

 **6.4** Abrirá uma jabela: Nova Variável de Sistema.

 **6.5** Nome da variável: JAVA_HOME

 **6.6** Valor da variável: em seguida OK. *O valor da variável é o caminho do diretório que você descompactou o zip JDK Zulu 11.0.11+9 no passo 5*

 **6.7** Na mesma janela Variáveis do Sistema, localize a variável Path, selecione e clique a opção Editar...

 **6.8** Clique na opção Novo e cole o mesmo caminho do passo 5 acrescentando \bin

 **6.9** Continue com o path selecionado e clique na opção Mover para Cima até chegar no topo

🔹 **7.** Pronto, finalizada a configuração. Próximo passo é conferir se está instalado tudo certinho

🔹 **8.** Abra o Prompt de Comando: Menu iniciar -> cmd

🔹 **9.** Vamos conferir mais uma vez se o Java está instalado na nossa máquina

```
java -version
```

*Créditos: [DevSuperior](https://www.youtube.com/watch?v=laC0fiI-IOM)*



### 🔺 Instalação Eclipse

🔹 **1.** Acessar o site oficial do [**ECLIPSE**](https://www.eclipse.org/downloads/)

🔹 **2.** Fazer o download do instalador

🔹 **3.** Escolha segunda a opção: Eclipse IDE for Enterprise Java and Web Developers [**Link de download para Windows**](https://www.eclipse.org/downloads/packages/)

🔹 **4.** Clique no folder da primeira opção (Java 11 + VM) e selecione o JDK que instalamos na nossa máquina

🔹 **5.** Mantenha as opções "create start menu entry" e "create desktop shortcut"

🔹 **6.** Install

🔹 **7.** Accept now

🔹 **8.** Launch

🔹 **9.** Pronto, intalação concluída



### 🔺 Instalação IntelliJ IDEA Community

🔹 **1.** Entre no site ofical do [**INTELLIJ**](https://www.jetbrains.com/idea/download/#section=windows)

🔹 **2.** Escolha a opção Community e faça o download

🔹 **3.** Siga com next

🔹 **4.** Na opção Installation Options, deixe selecionado as opções: **4.1** 64-bit launcher (caso seu sistema seja 64-bit, caso não, selecione 32-bit) **4.2** Add "Open Folder as Project" **4.3** .java - .groovy - .kt - .kts **4.4** Add lauchers dir to the PATH **4.5** Next

🔹 **5.** Install

🔹 **6.** Para finalizar a instalação, escolha a opção reebot later

🔹**7.** Com o IntelliJ já instalado, vamos iniciar:

 **7.1** Aceite os termos: I confirm that I have... >> Confirm

 **7.2** Data Sharing >> Send Anonymous Statistics

🔹**8.** IDE pronta para uso!



### 🔺 Instalação Git

🔹 **1.** Entre no site ofical do [**GIT**](https://git-scm.com/downloads)

🔹 **2.** Escolha a opção Windows e o instalador será baixado automáticamente

🔹 **3.** Mantenha as opções pré selecionadas e siga com Next

🔹 **4.** Install

🔹 **5.** Antes de finaizar a instalação, selecione a opção Lauch Git Bash

🔹**6.** Ao finalizar o passo 5, irá abrir o Git Bash

🔹**7.** Agora vamos fazer as configurações iniciais:

🔹**8.** Confirme se o git realmente está instalado:

```
git --version
```

🔹**9.** Vamos começar as configurações iniciais:

 **9.1** Configurar o nome de usuário

```
git config --global user.name "Seu nome"
```

 **9.2** Configurar o endereço de e-mail: *É de suma importância que o ENDEREÇO DE E-MAIL SEJA O MESMO DO GITHUB afim de evitar conflitos!*

```
git config --global user.email seuemail@email.br
```

 **9.3** Vamos conferir a lista de configurações:

```
git config --list
```

🔹**10.** Pronto, git instalado e configurado com sucesso!





## 🤝 Contribuindo

Este repositório foi criado para fins de estudo, então contribua com ele. Se te ajudei de alguma forma, ficarei feliz em saber. E caso você conheça alguém que se identidique com o conteúdo, não deixe de compatilhar.

Se possível:

⭐️ Star o projeto

🐛 Encontrar e relatar issues

------

Disponibilizado com ♥ por [cami-la](https://www.linkedin.com/in/cami-la/).





