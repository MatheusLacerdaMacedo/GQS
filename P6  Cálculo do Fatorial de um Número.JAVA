import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        int numeroFatorial = lerNumero("Informe um número para calcular o fatorial:");
        if (numeroFatorial >= 0) {
            long fatorial = calcularFatorial(numeroFatorial);
            JOptionPane.showMessageDialog(null, "O fatorial de " + numeroFatorial + " é: " + fatorial);
        } else {
            JOptionPane.showMessageDialog(null, "Número inválido.");
        }
    }

    // Método para ler um número inteiro a partir de uma caixa de diálogo
    private static int lerNumero(String mensagem) {
        String entrada = JOptionPane.showInputDialog(mensagem);
        return Integer.parseInt(entrada);
    }

    // Método para calcular o fatorial de um número
    private static long calcularFatorial(int numero) {
        long fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
