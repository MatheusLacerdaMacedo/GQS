import java.util.Scanner;

public class Pessoa {
    private String nome;

    // Construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Getter e setter para o nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para ler o nome a partir do teclado
    public void lerNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome: ");
        nome = scanner.nextLine();
    }

    // Método para imprimir os detalhes da pessoa
    public void imprimirDetalhes() {
        System.out.println("Nome: " + nome);
    }
}
