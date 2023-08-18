package Avaliativas;

import java.util.Scanner;

public class Executora {
    public static void exibirMenu1(){
        System.out.println("|         Menu         |");
        System.out.println("|1 - Cadastrar         |");
        System.out.println("|2 - Calcular IPVA     |");
        System.out.println("|3 - Sair              |");
    }

    public static void exibirMenu2(){
        System.out.println("|      Menu      |");
        System.out.println("|1 - Caminhão    |");
        System.out.println("|2 - Carro       |");
        System.out.println("|3 - Ônibus      |");
    }

    public static void main(String[] args) {
        String placa, cor, marca, modelo;
        int ano, assentos, eixos, opcao;
        float preco;
        Veiculo veiculo = new Veiculo();
        Caminhao caminhao = new Caminhao();
        Carro carro = new Carro();
        Onibus onibus = new Onibus();
        Scanner scanner = new Scanner(System.in);

        exibirMenu2();
        opcao = scanner.nextInt();

        if(opcao == 1){
            do {
                exibirMenu1();
                opcao = scanner.nextInt();
                if (opcao == 1){
                    System.out.println("Digite a marca do caminhão: ");
                    marca = scanner.next();
                    System.out.println("Digite o modelo do caminhão: ");
                    modelo = scanner.next();
                    System.out.println("Digite o ano do caminhão: ");
                    ano = scanner.nextInt();
                    System.out.println("Digite a placa do caminhão: ");
                    placa = scanner.next();
                    System.out.println("Digite a cor do caminhão: ");
                    cor = scanner.next();
                    System.out.println("Digite o preço do caminhão: ");
                    preco = scanner.nextFloat();
                    caminhao = new Caminhao(placa, cor,marca, modelo, ano, preco);
                } else {
                    System.out.println("1 - Calcular IPVA de caminhão já cadastrado. \n2 - Calcular valor de caminhão não cadastrado. ");
                    opcao = scanner.nextInt();
                    if (opcao == 1){
                        System.out.println(caminhao.calcularIPVA(caminhao.getPreco()));
                    } else {
                        System.out.println("Digite o preço do caminhão: ");
                        preco = scanner.nextFloat();
                        System.out.println(caminhao.calcularIPVA(preco));
                    }
                }
            }while (opcao != 3);

        } else if (opcao == 2) {
            System.out.println("Digite a marca do carro: ");
            marca = scanner.next();
            System.out.println("Digite o modelo do carro: ");
            modelo = scanner.next();
            System.out.println("Digite o ano do carro: ");
            ano = scanner.nextInt();
            System.out.println("Digite a placa do carro: ");
            placa = scanner.next();
            System.out.println("Digite a cor do carro: ");
            cor = scanner.next();
            System.out.println("Digite o preço do carro: ");
            preco = scanner.nextFloat();
            carro = new Carro(placa, cor, marca, modelo, ano, preco);
            System.out.println(carro.calcularIPVA(preco));
        }else {
            System.out.println("Digite a marca do ônibus: ");
            marca = scanner.next();
            System.out.println("Digite o modelo do caminhão: ");
            modelo = scanner.next();
            System.out.println("Digite o ano do ônibus: ");
            ano = scanner.nextInt();
            System.out.println("Digite a placa do ônibus: ");
            placa = scanner.next();
            System.out.println("Digite a cor do ônibus: ");
            cor = scanner.next();
            System.out.println("Digite o preço do ônibus: ");
            preco = scanner.nextFloat();
            onibus = new Onibus(placa, cor, marca, modelo, ano, preco);
            System.out.println(onibus.calcularIPVA(preco));
        }



    }
}
