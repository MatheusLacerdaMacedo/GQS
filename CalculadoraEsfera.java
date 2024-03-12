import java.util.Scanner;

public class CalculadoraEsfera {
    public static void main(String[] args) {
        // Cria um Scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém o valor do raio da esfera
        System.out.print("Informe o valor do raio da esfera: ");
        double raio = scanner.nextDouble();

        // Fecha o Scanner após a obtenção da entrada
        scanner.close();

        // Calcula o comprimento da esfera (circunferência)
        double comprimento = 2 * Math.PI * raio;

        // Calcula a área da esfera
        double area = Math.PI * Math.pow(raio, 2);

        // Calcula o volume da esfera
        double volume = (3.0 / 4.0) * Math.PI * Math.pow(raio, 3);

        // Apresenta os resultados
        System.out.println("O comprimento da esfera é: " + comprimento);
        System.out.println("A área da esfera é: " + area);
        System.out.println("O volume da esfera é: " + volume);
    }
}
