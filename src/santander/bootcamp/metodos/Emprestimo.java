package santander.bootcamp.metodos;

public class Emprestimo {

    public static int getTwoParcels() {
        return 2;
    }
    public static int getThreeParcels() {
        return 3;
    }
    public static double getTwoTaxParcels() {
        return 0.3;
    }
    public static double getThreeTaxParcels() {
        return 0.45;
    }

    public static void calculate(double value, int parcels) {
        if(parcels == 2) {
            double finalValue = value + (value * getTwoTaxParcels());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + finalValue);
        } else if ( parcels == 3) {
            double finalValue = value + (value * getThreeTaxParcels());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + finalValue);
        } else {
            System.out.println("Quantidade de parcelas não aceita");
        }
    }

}
