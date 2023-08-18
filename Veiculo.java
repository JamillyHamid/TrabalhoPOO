package Avaliativas;

public class Veiculo {
    private String placa, cor, marca, modelo;
    private int ano;
    private float preco;

    public Veiculo() {

    }

    public Veiculo(String placa, String cor, String marca, String modelo, int ano, float preco) {
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void exibirDados(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Cor: " + this.cor);
        System.out.println("Preço: " + this.preco);
    }

}
