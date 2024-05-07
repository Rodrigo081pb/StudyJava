import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AbautMe {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            // Iniciando tratamento
            try {
                // Criando o objeto scanner
                Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

                System.out.println("Digite seu nome:");
                String nome = scanner.next();

                System.out.println("Digite seu sobrenome:");
                String sobrenome = scanner.next();

                System.out.println("Digite sua idade:");
                int idade = scanner.nextInt();

                System.out.println("Digite sua altura:");
                double altura = scanner.nextDouble();

                // Imprimindo dados informados pelo usuário
                System.out.println("Olá, me chamo " + nome + " " + sobrenome);
                System.out.println("Tenho " + idade + " anos.");
                System.out.println("Minha altura é: " + altura + " cm.");

                continuar = false; // Saia do loop se todas as entradas forem válidas
            } catch (InputMismatchException e) {
                System.err.println("Os campos idade e altura precisam ser numéricos.");
            }
        }
    }
}
