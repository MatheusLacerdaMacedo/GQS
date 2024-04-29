import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        int limiteInferior = lerNumero("Informe o limite inferior:");
        int limiteSuperior = lerNumero("Informe o limite superior:");
        int somaImpares = calcularSomaImpares(limiteInferior, limiteSuperior);
        JOptionPane.showMessageDialog(null, "A soma dos números ímpares entre " + limiteInferior +
                                            " e " + limiteSuperior + " é: " + somaImpares);
    }

    // Método para ler um número inteiro a partir de uma caixa de diálogo
    private static int lerNumero(String mensagem) {
        String entrada = JOptionPane.showInputDialog(mensagem);
        return Integer.parseInt(entrada);
    }

    // Método para calcular a soma dos números ímpares entre dois limites
    private static int calcularSomaImpares(int limiteInferior, int limiteSuperior) {
        int soma = 0;
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        return soma;
    }
}
