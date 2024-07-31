package NivelBasico;
import java.util.Scanner;

public class MainContaBancaria {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        String numeroDaConta = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(numeroDaConta, saldoInicial);

        int opcao = 0;
        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver Saldo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    conta.verSaldo();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
