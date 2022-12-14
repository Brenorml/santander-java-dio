package santander.bootcamp.collections.set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      Set notas = new HashSet(); //antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
/*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
*/
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        // ordem aleatoria, não repetiu o 7

        System.out.println("Exiba a posição da nota 5.0: ");
        //Não é possível pesquisar a posição do vetor uma vez que não tem o método indexOf() na interface set

        System.out.println("Adicione na lista a nota 8.0 na posição 4:  ");
        //Não é possível pesquisar a posição do vetor uma vez que não tem o método indexOf() na interface set

        System.out.println("Substitua a nota 5.0 pela nota 6.0  ");
        //novamente não existe método get na interface set, apenas se fosse em uma interface list

        System.out.println("Confira se a nota 5 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a terceira nota adicionada");
        //novamente não existe método get na interface set, apenas se fosse em uma interface list

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores" );

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma é: " + soma);
        //valor for diferente da soma nos exercicios do list porque no set os elementos não se repetem

        System.out.println("A média das notas é: " + (soma/ notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d); //atentar porque o remove não aceita inteiros
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        //não é possivel trabalhar com index com set

        System.out.println("Remova as notas menores que 7 e exiba a lista");

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d); //IDE já acusa que tem um elemento duplicado
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem  crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2); //so aceitou a classe notas2 porque ela já contem o comparable, ou seria necessario por o comparator para funcionar
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto ");
        notas.clear();
        System.out.println("Confira se o conjunto está vazio? " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio? " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio? " + notas3.isEmpty());





    }
}
