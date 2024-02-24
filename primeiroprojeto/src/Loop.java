import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double notaUsuario = 0;

        System.out.println("Qual filme você quer avaliar? ");
        String filmeAvaliar = leitura.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual sua nota para o filme? de 0 a 10");
            notaUsuario = leitura.nextDouble(); //recebe a nota do usuário
            mediaAvaliacao += notaUsuario; //pega a media e soma com a nota do usuário
        }
        System.out.println("Média de avaliação do Filme " + filmeAvaliar + " é de " + mediaAvaliacao/3);
    }
}
