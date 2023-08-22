package OrientacaoObjetos;

public class Veiculo {
    private String modelo;
    private String marca;
    private String cor;
    private String placa;
    private int ano;
    private String tanqueCombustivel;
    private  double velocidade;

    public Veiculo(){

    }

    public Veiculo(String modelo, String marca, String cor, String placa, int ano, String tanqueCombustivel, double velocidade) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
        this.ano = ano;
        this.tanqueCombustivel = tanqueCombustivel;
        this.velocidade = velocidade;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTanqueCombustivel() {
        return tanqueCombustivel;
    }

    public void setTanqueCombustivel(String tanqueCombustivel) {
        this.tanqueCombustivel = tanqueCombustivel;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void mostrarDados(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca " + this.marca);
        System.out.println("Cor " + this.cor);
        System.out.println("Ano " + this.ano);
        System.out.println("Placa " + this.placa);
        System.out.println("Tanque de Combustível " + this.tanqueCombustivel);
    }

    public void ligar(){
        System.out.println("O veículo está ligado.");
    }

    public void desligar(){
        System.out.println("O veículo está desligado.");

    }
    public void acenderFarol(){
        System.out.println("O farol está acesso.");
    }
    public void acelerar(){
        System.out.println("O veículo está à acelerar.");
    }
    public void frear(){
        System.out.println("O veículo está a frear.");
    }
}
