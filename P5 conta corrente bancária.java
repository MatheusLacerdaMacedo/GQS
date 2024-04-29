import javax.swing.JOptionPane;

public class Principal {
    public static void main(String args[]) {
        String entrada;
        do {
            entrada = JOptionPane.showInputDialog("Informe o número da conta corrente (3 dígitos): ");
            // Verifica se a entrada possui 3 dígitos
            if (entrada.length() != 3) {
                JOptionPane.showMessageDialog(null, "Número da conta corrente deve ter 3 dígitos.");
                continue;
            }
            int numeroConta = Integer.parseInt(entrada);
            int digitoVerificador = calcularDigitoVerificador(numeroConta);
            JOptionPane.showMessageDialog(null, "O dígito verificador da conta corrente é: " + digitoVerificador);

            entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
        } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
    }

    // Método para calcular o dígito verificador de uma conta corrente
    private static int calcularDigitoVerificador(int numeroConta) {
        // Obtém os dígitos da conta
        int centena = numeroConta / 100;
        int dezena = (numeroConta / 10) % 10;
        int unidade = numeroConta % 10;

        // Calcula a soma dos dígitos da conta e seu inverso
        int soma = numeroConta + (unidade * 100 + dezena * 10 + centena);

        // Multiplica cada dígito pela sua posição e soma
        int somaMultiplicacoes = (centena * 0) + (dezena * 1) + (unidade * 2) + (soma % 10 * 3);

        // Retorna o dígito verificador
        return somaMultiplicacoes % 10;
    }
}
