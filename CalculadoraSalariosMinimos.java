import java.util.Scanner;

public class CalculadoraSalariosMinimos {
    public static void main(String[] args) {
        // Cria um Scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém o valor do salário mínimo
        System.out.print("Informe o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        // Solicita e obtém o valor do salário do funcionário
        System.out.print("Informe o valor do salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();

        // Fecha o Scanner após a obtenção das entradas
        scanner.close();

        // Calcula a quantidade de salários mínimos que o funcionário recebe
        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;

        // Apresenta a quantidade de salários mínimos
        System.out.println("O funcionário recebe aproximadamente " + quantidadeSalariosMinimos + " salários mínimos.");
    }
}
