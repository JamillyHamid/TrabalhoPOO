package Avaliativas;

public class Carro extends Veiculo {
    int portas;
    //Arrumar as classes para coisas específicas.


    public Carro() {
    }

    public Carro(String placa, String cor, String marca, String modelo, int ano, float preco) {
        super(placa, cor, marca, modelo, ano, preco);
    }

    public float calcularIPVA (float preco){
        float IPVA;
        IPVA = preco*1/100;
        return IPVA;
    }
}
