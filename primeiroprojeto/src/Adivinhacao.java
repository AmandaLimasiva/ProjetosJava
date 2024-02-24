import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numero = new Random().nextInt(100);
        int numeroSugerido;
        //int chances;

        //System.out.println(numero); //comentar depois

        for (int quantTentativas = 1; quantTentativas <= 5 ; quantTentativas++) {
            System.out.println("Informe um número! Lembrando que você possui 5 tentativas para acertar o número.");
            numeroSugerido = leitura.nextInt();

            if(numeroSugerido == numero){
                System.out.println("Você acertou em cheio o número!");
                break;
            }else{
                if(numeroSugerido < numero){
                    System.out.println("O número " + numeroSugerido + " é menor do que o número sorteado. Escolha outro número maior! Você usou sua " + quantTentativas + " tentativa(s)!");
                }else{
                    System.out.println("O número " + numeroSugerido + " é maior que o número sorteado. Escolha outro número menor! Você usou sua " + quantTentativas + " tentativa(s)!");
                }
            }if (quantTentativas == 5){
                System.out.println("Você usou todas suas tentativas! Fica para uma próxima :)");
            }
        }
        System.out.println("O número sorteado foi " + numero);
    }
}
