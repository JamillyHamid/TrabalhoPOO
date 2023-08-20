package OrientaçaoOjetos;

import java.util.Scanner;

public class ExecutoraVeiculo {
    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);

        Carro carro1 = new Carro("land Cruiser V8", "Toyota", "Preto","BP97HY",2023, "Disel",370);
        Onibus onibus1 = new Onibus("Turismo", "Mercedes", "Vermelho","BC8O2U",2012,"Gasolina",17);
        Caminhao caminhao1 = new Caminhao("FH460","Volvo","Branca","RD452O",2020,"Gasoléo",406);


        do {

            System.out.println("-----------------------MENU-------------------------");
            System.out.println("|---------------------------------------------------|");
            System.out.println("| 1 - Criar objeto.             |");
            System.out.println("| 2 - Ligar o Carro.             |");
            System.out.println("| 3 - Abrir as portar do carro.  |");
            System.out.println("| 4 - ligar o ônibus             |");
            System.out.println(" 5 - Anunciar Paragem do ônibus  | ");
            System.out.println("| 0 - Sair.                      |");
            System.out.println("|---------------------------------------------------|");
            System.out.print("Digite uma opcao valida: ");
            opcao = scanner.nextInt();

            switch (opcao){

                case 1:
                Veiculo carro = new Veiculo();
                    System.out.println("Objeto criado com sucesso!");
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
            }

        }while( opcao == 0);


        
    }


}
