import java.util.concurrent.ThreadLocalRandom; // Importando a classe do pacote para gerar números aleatórios

public class EnquantoWhile {
    public static void main(String[] args) {
        /*
         * No exemplo a seguir Pedro recebeu R$ 100 de mesada e foi a uma joalheria
         * gastar comprando joias, logo, enquanto o valor da aliança não se igualar a R$
         * 100 ele poderá comprar joias e colocar num guarda-joias
         */

        double mesada = 100; // Declaração de váriavel de valor que pedro recebeu de mesada

        // enquanto a mesada for maior que zero
        while (mesada > 0) {

            // chamando o método para gerar um valor aleatório pra o valor da joia
            Double valorJoia = valorAleatorio(); // Vai ser um valor aleatório

            if (valorJoia > mesada) // se o valor da joia (valorJoia) é maior do que a mesada disponível (mesada).
                                    // Se for, define o valor da joia igual ao valor da mesada.
                valorJoia = mesada;

            System.out.println("O valor da joia é: " + valorJoia + "Adicionado no guarda joias"); // mprime o valor da
                                                                                                  // joia gerado e
                                                                                                  // informa que a joia
                                                                                                  // foi adicionada ao
                                                                                                  // guarda-joias.

            mesada = mesada - valorJoia;// Subtrai o valor da joia (valorJoia) do valor total da mesada (mesada).
        }

        System.out.println("Mesada: " + mesada); // Imprime o valor atual da mesada após a compra da joia
        System.out.println("Pedro gastou toda sua mesada em jóias");

    }

    private static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(5, 10); // Método para gerar valor entre 5 e 10
    }
}

// Enquanto ele tiver dinheiro na mesada, ele continuará comprando joias
// aleatórias até esgotar o saldo. Cada vez que ele compra uma joia, o valor é
// subtraído da sua mesada. O programa termina quando ele não tiver mais
// dinheiro. O método valorAleatorio() é utilizado para gerar valores aleatórios
// para as joias.