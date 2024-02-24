import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double notaUsuario = 0;
        int quantAvaliacoes = 0;

        System.out.println("Qual filme você quer avaliar? ");
        String filmeAvaliar = leitura.nextLine();

        while (notaUsuario != -1 ) {
            System.out.println("Qual sua nota para o filme de 1 a 10? Ou informe -1 para encerrar");
            notaUsuario = leitura.nextDouble(); //recebe a nota do usuário

            if(notaUsuario <= 0 || notaUsuario > 10 ){
                System.out.println("Nota inválida, por favor verificar!");
            }else{
                if(notaUsuario != -1){
                    mediaAvaliacao += notaUsuario; //pega a media e soma com a nota do usuário
                    quantAvaliacoes ++;
                }
            }
        }
        System.out.println("Média de avaliação do Filme " + filmeAvaliar + " é de " + mediaAvaliacao/quantAvaliacoes);
    }
}

