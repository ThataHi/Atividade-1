package NivelMedio;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class MainAgenda {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        
        int opcao = 0;
        
        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Adicionar Compromisso");
            System.out.println("2. Ver Compromissos por Data");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite a data do compromisso (AAAA-MM-DD): ");
                    LocalDate data = LocalDate.parse(scanner.nextLine());
                    System.out.print("Digite a hora do compromisso (HH:MM): ");
                    LocalTime hora = LocalTime.parse(scanner.nextLine());
                    System.out.print("Digite a descrição do compromisso: ");
                    String descricao = scanner.nextLine();
                    
                    Compromisso compromisso = new Compromisso(data, hora, descricao);
                    agenda.adicionarCompromisso(compromisso);
                    
                    System.out.println("Compromisso adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite a data para ver compromissos (AAAA-MM-DD): ");
                    LocalDate dataBusca = LocalDate.parse(scanner.nextLine());
                    List<Compromisso> compromissosNaData = agenda.obterCompromissos(dataBusca);

                    System.out.println("Compromissos na data " + dataBusca + ":");
                    if (compromissosNaData.isEmpty()) {
                        System.out.println("Nenhum compromisso encontrado para essa data.");
                    } else {
                        for (Compromisso c : compromissosNaData) {
                            System.out.println(c.detalhes());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
