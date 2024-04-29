import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {
    private List<Pessoa> listaPessoas;

    // Construtor
    public Cadastro() {
        this.listaPessoas = new ArrayList<>();
    }

    // Método para cadastrar pessoa no vetor
    public void cadastrarPessoa(Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }

    // Método para imprimir o vetor de cadastro
    public void imprimirCadastro() {
        for (Pessoa pessoa : listaPessoas) {
            pessoa.imprimirDetalhes();
        }
    }

    // Método para imprimir apenas as pessoas físicas
    public void imprimirPessoasFisicas() {
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa instanceof PessoaFisica) {
                pessoa.imprimirDetalhes();
            }
        }
    }

    // Método para imprimir apenas as pessoas jurídicas
    public void imprimirPessoasJuridicas() {
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa instanceof PessoaJuridica) {
                pessoa.imprimirDetalhes();
            }
        }
    }

    // Método para pesquisar pessoa por CPF ou CNPJ
    public Pessoa pesquisarPessoa(String chave) {
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa instanceof PessoaFisica && ((PessoaFisica) pessoa).getCpf().equals(chave)) {
                return pessoa;
            }
            if (pessoa instanceof PessoaJuridica && ((PessoaJuridica) pessoa).getCnpj().equals(chave)) {
                return pessoa;
            }
        }
        return null;
    }

    // Método para atualizar pessoa por CPF ou CNPJ
    public void atualizarPessoa(String chave, Pessoa pessoaAtualizada) {
        for (int i = 0; i < listaPessoas.size(); i++) {
            Pessoa pessoa = listaPessoas.get(i);
            if ((pessoa instanceof PessoaFisica && ((PessoaFisica) pessoa).getCpf().equals(chave)) ||
                    (pessoa instanceof PessoaJuridica && ((PessoaJuridica) pessoa).getCnpj().equals(chave))) {
                listaPessoas.set(i, pessoaAtualizada);
                break;
            }
        }
    }

    // Método para excluir pessoa por CPF ou CNPJ
    public void excluirPessoa(String chave) {
        listaPessoas.removeIf(pessoa -> (pessoa instanceof PessoaFisica && ((PessoaFisica) pessoa).getCpf().equals(chave)) ||
                (pessoa instanceof PessoaJuridica && ((PessoaJuridica) pessoa).getCnpj().equals(chave)));
    }
}
