import java.util.Scanner;

    // Loop infinito para manter o programa em execução até que o usuário decida
    // sair
    // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
    // Dica: Utilze o switch/case para o programa realizar as operações escolhidas
    // pelo usuário.
    // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:



public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        // Loop infinito para manter o programa em execução até que o usuário decida
        // sair
        while (true) {
            // Exibindo o menu
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("0 - Encerrar");

            int opcao = scanner.nextInt();

            // Implementando as operações de acordo com a opção escolhida
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado:");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Depósito realizado com sucesso.");
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado:");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    scanner.close(); // Fechando o Scanner
                    return; // Encerrando o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
