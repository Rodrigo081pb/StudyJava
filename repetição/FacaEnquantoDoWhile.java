import java.util.Random;

public class FacaEnquantoDoWhile {
    public static void main(String[] args) {

        /*
         * No exemplo a seguir Rodrigo resolveu ligar para o seu amigo dizendo que hoje
         * se entupiu de comer tantas besteiras
         */

        System.out.println("Ligando...");

        do {
            // Inicia um loop do-while. Este tipo de loop garante que o bloco de código seja
            // executado pelo menos uma vez, mesmo que a condição seja falsa desde o início.
            // Executando repetidas vezes até alguém atender

            System.out.println("Telefone tocando");
            // A condição do loop do-while é a chamada do método tocando(). Enquanto esse
            // método retornar true, o loop continuará. Se ele retornar false, o loop
            // termina.
        } while (tocando());

        System.out.println("Alô !!!"); // Após o loop, quando alguém atender o telefone, é impresso "Alô !!!".

    }

    // Define o método tocando(), que retorna um valor booleano indicando se o
    // telefone está tocando ou não.
    private static boolean tocando() {

        // Cria um objeto da classe Random para gerar um número aleatório entre 0 e 2.
        // Se o número gerado for igual a 1, consideramos que alguém atendeu o telefone
        // (atendeu = true).
        boolean atendeu = new Random().nextInt(3) == 1;

        // Imprime se o telefone foi atendido ou não.
        System.out.println("Atendeu? " + atendeu);

        // Retorna o oposto do valor de atendeu. Ou seja, retorna true se o telefone não
        // foi atendido nesta chamada, o que faz com que o loop do-while continue, ou
        // retorna false se alguém atendeu, finalizando o loop.
        return !atendeu;
    }

}
