import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) { //Classe Scanner
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe seu filme favorito");
        String filmeFav = leitura.nextLine();

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();


        System.out.println("Qual sua nota para o filme? de 0 a 10");
        double avaliacao = leitura.nextDouble();


        System.out.println(filmeFav);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
