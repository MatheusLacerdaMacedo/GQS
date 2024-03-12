import java.util.Scanner;

public class ConversorCelsiusFahrenheit {
    public static void main(String[] args) {
        // Cria um Scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém a temperatura em Celsius do usuário
        System.out.print("Informe a temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        // Fecha o Scanner após a obtenção da entrada
        scanner.close();

        // Calcula a temperatura em Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        // Apresenta a temperatura em Fahrenheit
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
    }
}
