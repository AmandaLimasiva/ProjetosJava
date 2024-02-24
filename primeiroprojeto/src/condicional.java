public class condicional {
    public static void main(String[] args) {
        int anoDeLancamento;
        anoDeLancamento = 2020;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 5.5;
        String tipoPlano = "normal";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else{
            System.out.println("Filme retrô que vale a pena assisitir!");
        }

        if ((incluidoNoPlano == true) || tipoPlano.equals("plus")) {
            System.out.println("Filme está liberado para você assistir!");
        }else{
            System.out.println("Deve atualizar o plano para você assistir!");
        }

    }
}
