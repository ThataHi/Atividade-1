package NivelBasico;
import java.util.Scanner;

public class MainEstudante {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do estudante: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do estudante: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a nota do estudante: ");
        double nota = scanner.nextDouble();

        Estudante estudante = new Estudante(nome, idade, nota);

        boolean foiAprovado = estudante.aprovado();

        if (foiAprovado) {
            System.out.println("O estudante " + estudante.getNome() + " foi aprovado.");
        } else {
            System.out.println("O estudante " + estudante.getNome() + " não foi aprovado.");
        }

        scanner.close();
    }
}
