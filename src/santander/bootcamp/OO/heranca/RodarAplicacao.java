package santander.bootcamp.OO.heranca;

public class RodarAplicacao {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Vendedor vendedor = (Vendedor) new Funcionario(); - Não procede com o downcast
    }
}
