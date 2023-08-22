package OrientacaoObjetos;

import java.util.Scanner;

public class CadastroVeiculos {
    private Scanner scanner = new Scanner(System.in);

    public Veiculo criarCarro() {
        System.out.print("Informe o modelo do carro: ");
        String modelo = scanner.nextLine();
        System.out.print("Informe a marca do carro: ");
        String marca = scanner.nextLine();
        System.out.print("Informe a cor do carro: ");
        String cor = scanner.nextLine();
        System.out.print("Informe a placa do carro: ");
        String placa = scanner.nextLine();
        System.out.print("Informe o ano do carro: ");
        int ano = scanner.nextInt();
        System.out.print("Informe o tipo de combustível do carro: ");
        String tanqueCombustivel = scanner.nextLine();
        System.out.print("Informe a velocidade máxima do carro: ");
        double velocidade = scanner.nextDouble();

        return new Carro(modelo, marca, cor, placa, ano, tanqueCombustivel, velocidade);
    }

    public Veiculo criarOnibus() {
        System.out.print("Informe o modelo do Onibus: ");
        String modelo = scanner.nextLine();
        System.out.print("Informe a marca do Onibus: ");
        String marca = scanner.nextLine();
        System.out.print("Informe a cor do Onibus: ");
        String cor = scanner.nextLine();
        System.out.print("Informe a placa do Onibus: ");
        String placa = scanner.nextLine();
        System.out.print("Informe o ano do Onibus: ");
        int ano = scanner.nextInt();
        System.out.print("Informe o tipo de combustível do Onibus: ");
        String tanqueCombustivel = scanner.nextLine();
        System.out.print("Informe a velocidade máxima do Onibus: ");
        double velocidade = scanner.nextDouble();

        return new Onibus(modelo, marca, cor, placa, ano, tanqueCombustivel, velocidade);
    }

    public Veiculo criarCaminhao() {
        System.out.print("Informe o modelo do Caminhao: ");
        String modelo = scanner.nextLine();
        System.out.print("Informe a marca do Caminhao: ");
        String marca = scanner.nextLine();
        System.out.print("Informe a cor do Caminhao: ");
        String cor = scanner.nextLine();
        System.out.print("Informe a placa do Caminhao: ");
        String placa = scanner.nextLine();
        System.out.print("Informe o ano do Caminhao: ");
        int ano = scanner.nextInt();
        System.out.print("Informe o tipo de combustível do Caminhao: ");
        String tanqueCombustivel = scanner.nextLine();
        System.out.print("Informe a velocidade máxima do Caminhao: ");
        double velocidade = scanner.nextDouble();

        return new Caminhao(modelo, marca, cor, placa, ano, tanqueCombustivel, velocidade);
    }

    public void exibirDetalhes(Veiculo veiculo) {
        System.out.println("Detalhes do Veículo:");
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Cor: " + veiculo.getCor());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Ano: " + veiculo.getAno());
        System.out.println("Tanque de Combustivel: " + veiculo.getTanqueCombustivel());
        System.out.println("Velocidade: " + veiculo.getVelocidade());
    }
}

