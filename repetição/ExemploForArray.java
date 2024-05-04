public class ExemploForArray {
    public static void main(String[] args) {
        // Em arrays o indice inicia em 0

        String alunos[] = { "Rodrigo", "Amanda", "Sophia" };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
        }

        // Outra forma

        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }

        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        for (int number : numbers) {
            System.out.println("É " + number + " Tá tá tá");
        }

    }
}
