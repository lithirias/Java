public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2022;
        boolean incluidoPlano = true;
        double notaFilme = 8.1;
        String tipoPlano = "plus";

        if (anoLancamento >= 2022){
            System.out.println("Lançamentos curtidos:");
        }
        else{
            System.out.println("Retrô");
        }

        if(incluidoPlano || tipoPlano.equals("plus")){

            System.out.println("Liberado");
        }
        else{
            System.out.println("Pagar");
        }
    }
}
