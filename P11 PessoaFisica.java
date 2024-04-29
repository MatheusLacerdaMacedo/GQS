import java.util.Scanner;

public class PessoaFisica extends Pessoa {
    private String cpf;

    // Construtor
    public PessoaFisica(String nome) {
        super(nome);
    }

    // Getter e setter para o CPF
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método para ler o CPF a partir do teclado
    public void lerCpf() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o CPF: ");
        cpf = scanner.nextLine();
    }

    // Método para imprimir os detalhes da pessoa física
    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("CPF: " + cpf);
    }
}
