package santander.bootcamp.array;

/*
Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
*/

public class ordemInversa {
    public static void main(String[] args) {

        int [] vetor = {-6, -15, 20, 4, 3, 80};

        System.out.println("Vetor: ");
        int count = 0;
        while(count <= (vetor.length - 1)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }
}
