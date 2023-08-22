package OrientacaoObjetos;

import java.util.Scanner;

public class ExecutoraVeiculo {
    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);
        CadastroVeiculos cadastro = new CadastroVeiculos();

        Carro carro1 = new Carro("Land Cruiser V8", "Toyota", "Preto", "BP97HY", 2023, "Flex", 370);
        Onibus onibus1 = new Onibus("Turismo", "Mercedes", "Vermelho", "BC8O2U", 2012, "Gasolina", 17);
        Caminhao caminhao1 = new Caminhao("Carga", "Volvo", "Preto", "BC8AS1", 2012, "Diesel", 100);

        Veiculo veiculoCriado = null;

        while (true) {
            System.out.println(" -------------------------------------------------- ");
            System.out.println("|                       MENU                        |");
            System.out.println("|---------------------------------------------------|");
            System.out.println("| 1 - Criar objeto.                                 |");
            System.out.println("| 2 - Ligar o Carro.                                |");
            System.out.println("| 3 - Abrir as portas do carro.                     |");
            System.out.println("| 4 - Ligar o Ônibus.                               |");
            System.out.println("| 5 - Anunciar Paragem do Ônibus.                   |");
            System.out.println("| 6 - Ver listagem de veículos.                     |");
            System.out.println("| 0 - Sair.                                         |");
            System.out.println(" --------------------------------------------------- ");
            System.out.print("Digite uma opção válida: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual tipo de veículo deseja criar?");
                    System.out.println("1 - Carro / 2 - Ônibus / 3 - Caminhão");
                    int tipoVeiculo = scanner.nextInt();

                    switch (tipoVeiculo) {
                        case 1:
                            veiculoCriado = cadastro.criarCarro();
                            carro1 = (Carro) veiculoCriado;
                            break;
                        case 2:
                            veiculoCriado = cadastro.criarOnibus();
                            onibus1 = (Onibus) veiculoCriado;
                            break;
                        case 3:
                            veiculoCriado = cadastro.criarCaminhao();
                            caminhao1 = (Caminhao) veiculoCriado;
                            break;
                        default:
                            System.out.println("Tipo de veículo inválido.");
                            break;
                    }
                    if (veiculoCriado != null) {
                        System.out.println("Objeto " + veiculoCriado.getClass().getSimpleName() + " criado com sucesso!");
                    }
                    break;

                case 2:
                    carro1.ligar();
                    break;

                case 3:
                    carro1.abrirPortas();
                    break;

                case 4:
                    onibus1.ligar();
                    break;

                case 5:
                    onibus1.anunciarParagem();
                    break;

                case 6:
                    System.out.print("Digite o número do veículo (1 - Carro, 2 - Ônibus, 3 - Caminhão): ");
                    int numeroVeiculo = scanner.nextInt();
                    scanner.nextLine();

                    switch (numeroVeiculo) {
                        case 1:
                            cadastro.exibirDetalhes(carro1);
                            break;
                        case 2:
                            cadastro.exibirDetalhes(onibus1);
                            break;
                        case 3:
                            cadastro.exibirDetalhes(caminhao1);
                            break;
                        default:
                            System.out.println("Número de veículo inválido.");
                            break;
                    }

                case 0:
                    System.out.println("Saindo do programa.");
                    return;
                default:
                    System.out.println("Opção inválida. Digite uma opção válida.");
                    break;
            }
        }
    }
}
