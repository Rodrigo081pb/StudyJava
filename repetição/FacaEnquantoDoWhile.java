import java.util.Random;

public class FacaEnquantoDoWhile {
    public static void main(String[] args) {

        /*
         * No exemplo a seguir Rodrigo resolveu ligar para o seu amigo dizendo que hoje
         * se entupiu de comer tantas besteiras
         */

        System.out.println("Ligando...");

        do {
            // Executando repetidas vezes até alguem atender

            System.out.println("Telefone tocando");
        } while (tocando());

        System.out.println("Alô !!!");

    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);

        return !atendeu;
    }

}
