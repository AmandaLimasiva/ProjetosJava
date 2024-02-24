//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é p Screen Match ");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento;
        anoDeLancamento = 2022;

        System.out.println("Ano de Lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = false;
        double notaDoFilme = 5.5;

        //media calculada pelas notas dos críticos
        double media = (9.5 + 5.5 + 7.6) / 3;

        System.out.println(media);

        String sinopse; //teste

        sinopse = "Filme do Tom Cruise! ";
        System.out.printf(sinopse);

        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println("A classificação do filme é: " + classificacao);

        String saudacao = "Olá, meu nome é ";
        String nome = "Alice ";
        String continuacao = "e minha idade é ";
        int idade = 17;
        System.out.println(saudacao + nome + continuacao + idade);
    }
}