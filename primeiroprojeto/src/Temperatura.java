public class Temperatura {
    public static void main(String[] args){
        System.out.println("Conversão de Temperaturas");

        int temperaturaCelsius = 23;

        System.out.println("A temperatura agora é de: "+ temperaturaCelsius + " Celsius");

        System.out.println("*** Convertendo em Fahrenheit *** ");

        int temperaturaFahrenheit = (int) ((temperaturaCelsius * 1.8) + 32);

        System.out.println("A temperatura em Fahrenheit inteira é de " + temperaturaFahrenheit);

    }
}
