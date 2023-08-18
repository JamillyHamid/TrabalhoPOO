package Avaliativas;

public class Onibus extends Veiculo{
    private int assentos;

    public Onibus() {
    }

    public Onibus(String placa, String cor, String marca, String modelo, int ano, float preco) {
        super(placa, cor, marca, modelo, ano, preco);
    }


    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public float calcularIPVA (float preco){
        float IPVA;
        IPVA = preco*2/100;
        return IPVA;
    }


}
