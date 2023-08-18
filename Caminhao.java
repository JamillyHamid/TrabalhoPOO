package Avaliativas;

public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao() {
    }

    public Caminhao(String placa, String cor, String marca, String modelo, int ano, float preco) {
        super(placa, cor, marca, modelo, ano, preco);
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public float calcularIPVA (float preco){
        float IPVA;
        IPVA = preco*3/100;
        return IPVA;
    }

}
