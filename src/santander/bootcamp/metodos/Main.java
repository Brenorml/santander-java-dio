package santander.bootcamp.metodos;

public class Main {

    public static void main(String[] args) {

        //calculadora
        System.out.println("Exercicio da Calculadora");
        Calculadora.sum(3, 6);
        Calculadora.subtraction(9, 1.8);
        Calculadora.multiply(7, 8);
        Calculadora.division(5, 2.5);

        //mensagem
        System.out.println("Exercicio da Mensagem");
        Mensagem.getMessage(9);
        Mensagem.getMessage(14);
        Mensagem.getMessage(1);

        //Empréstimo
        System.out.println("Exercicio do Emprestimo");
        Emprestimo.calculate(1000, Emprestimo.getTwoParcels());
        Emprestimo.calculate(1000, Emprestimo.getThreeParcels());
        Emprestimo.calculate(1000,  5);

    }

}
