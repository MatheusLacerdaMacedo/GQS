public class Veiculo {
    private String numeroChassi;
    private String placa;
    private String marca;
    private String modelo;
    private int ano;

    // Construtor
    public Veiculo(String numeroChassi, String placa, String marca, String modelo, int ano) {
        this.numeroChassi = numeroChassi;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Getters e setters
    public String getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método toString para imprimir os detalhes do veículo
    @Override
    public String toString() {
        return "Veiculo{" +
                "numeroChassi='" + numeroChassi + '\'' +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
