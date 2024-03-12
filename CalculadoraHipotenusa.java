import java.util.Scanner;

public class CalculadoraHipotenusa {
    public static void main(String[] args) {
        // Cria um Scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém os valores dos catetos do usuário
        System.out.print("Informe o valor do primeiro cateto: ");
        double cateto1 = scanner.nextDouble();

        System.out.print("Informe o valor do segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        // Fecha o Scanner após a obtenção das entradas
        scanner.close();

        // Calcula o valor da hipotenusa usando o Teorema de Pitágoras
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        // Apresenta o valor da hipotenusa
        System.out.println("O valor da hipotenusa é: " + hipotenusa);
    }
}
