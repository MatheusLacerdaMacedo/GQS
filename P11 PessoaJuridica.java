import java.util.Scanner;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    // Construtor
    public PessoaJuridica(String nome) {
        super(nome);
    }

    // Getter e setter para o CNPJ
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Método para ler o CNPJ a partir do teclado
    public void lerCnpj() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o CNPJ: ");
        cnpj = scanner.nextLine();
    }

    // Método para imprimir os detalhes da pessoa jurídica
    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("CNPJ: " + cnpj);
    }
}
