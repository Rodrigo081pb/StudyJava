import java.util.Scanner;

public class CalculadoraDeMedias {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = { "Pedro", "Thiago", "João", "Lucas" };

        double media = calculoMediaTurma(alunos, scan);

        System.out.println("Média da turma %F,", media);
    }

    public static double calculoMediaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for (String aluno : alunos) {
            System.out.println("Nota do aluno %S", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }

}
