import java.util.Scanner;

public class CalculadoraAreaLosango {
    public static void main(String[] args) {
        // Cria um Scanner para obter entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém a diagonal maior do usuário
        System.out.print("Informe a diagonal maior do losango: ");
        double diagonalMaior = scanner.nextDouble();

        // Solicita e obtém a diagonal menor do usuário
        System.out.print("Informe a diagonal menor do losango: ");
        double diagonalMenor = scanner.nextDouble();

        // Fecha o Scanner após a obtenção das entradas
        scanner.close();

        // Calcula a área do losango
        double area = (diagonalMaior * diagonalMenor) / 2;

        // Apresenta a área calculada
        System.out.println("A área do losango é: " + area);
    }
}
