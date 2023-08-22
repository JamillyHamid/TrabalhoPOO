package OrientacaoObjetos;

public class Onibus extends  Veiculo{

    public Onibus(){
    }

    public Onibus(String modelo, String marca, String cor, String placa, int ano, String tanqueCombustivel, double velocidade) {
        super(modelo, marca, cor, placa,ano, tanqueCombustivel, velocidade);
    }

    @Override
    public void ligar(){
        System.out.println("ônibus ligado.");
    }
    public void desligar(){
        System.out.println("ônibus desligado.");
    }
    public void anunciarParagem(){
        System.out.println("Próxima paragem:...");
    }

}
