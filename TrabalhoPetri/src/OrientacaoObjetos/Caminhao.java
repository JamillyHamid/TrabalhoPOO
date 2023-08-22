package OrientacaoObjetos;

public class Caminhao extends Veiculo {
    public Caminhao(){
    }
    public Caminhao(String modelo, String marca, String cor, String placa, int ano, String tanqueCombustivel, double velocidade) {
        super(modelo, marca, cor, placa, ano, tanqueCombustivel, velocidade);
    }

    @Override
    public void ligar(){
        System.out.println("Caminhão ligado.");
    }
    public void desligar(){
        System.out.println("Caminhão desligado.");
    }
    public void carregarCarga(){
        System.out.println("Caminhão carregando.");
    }
    public void descarregarCarga(){
        System.out.println("Caminhão Descarregando");
    }
}
