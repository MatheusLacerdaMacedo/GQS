import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        int somaIdades = 0;
        int contador = 0;
        while (true) {
            int idade = lerNumero("Informe uma idade (ou um número negativo para sair):");
            if (idade < 0) {
                break;
            }
            somaIdades += idade;
            contador++;
        }
        double mediaIdades = contador > 0 ? (double) somaIdades / contador : 0;
        JOptionPane.showMessageDialog(null, "A média das idades informadas é: " + mediaIdades);
    }

    // Método para ler um número inteiro a partir de uma caixa de diálogo
    private static int lerNumero(String mensagem) {
        String entrada = JOptionPane.showInputDialog(mensagem);
        return Integer.parseInt(entrada);
    }
}
