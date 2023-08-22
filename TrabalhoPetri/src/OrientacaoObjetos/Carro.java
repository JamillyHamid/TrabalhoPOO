package OrientacaoObjetos;

public class Carro extends Veiculo{
    public Carro() {
    }

    public Carro(String modelo, String marca, String cor, String placa, int ano, String tanqueCombustivel, double velocidade) {
        super(modelo, marca, cor, placa,ano, tanqueCombustivel, velocidade);
    }

    @Override
    public void ligar(){
        System.out.println("Carro ligado.");
    }
    @Override
    public void desligar(){
        System.out.println("Carro desligado.");
    }
    public void abrirPortas(){
        System.out.println("Portas  abertas.");
    }
    public  void fecharPortas(){
        System.out.println("Portas Fechadas.");
    }
}
