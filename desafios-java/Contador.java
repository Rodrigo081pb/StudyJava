import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        @SuppressWarnings({ "resource", "unused" })
        Scanner scanner = new Scanner(System.in);

        int parametroUm = Integer.parseInt(args[0]);
        int parametroDois = Integer.parseInt(args[1]);

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
