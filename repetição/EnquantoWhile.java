import java.util.concurrent.ThreadLocalRandom;

public class EnquantoWhile {
    public static void main(String[] args) {
        /*
         * No exemplo a seguir Pedro recebeu R$ 100 de mesada e foi a uma joalheria
         * gastar comprando joias, logo, enquanto o valor da aliança não se igualar a R$
         * 100 ele poderá comprar joias e colocar num guarda-joias
         */

        double mesada = 100;

        while (mesada > 0) {
            Double valorJoia = valorAleatorio(); // Vai ser um valor aleatório

            if (valorJoia > mesada) // Se o valor da joia for maior que a mesada o valor da joia vai ser = mesada
                valorJoia = mesada;

            System.out.println("O valor da joia é: " + valorJoia + "Adicionado no guarda joias");

            mesada = mesada - valorJoia;// A mesada vai ser subtraida pelo valor da joia
        }

        System.out.println("Mesada: " + mesada); // Aqui vai ser exibido a mesada ao final do código
        System.out.println("Pedro gastou toda sua mesada em jóias");

    }

    private static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(5, 10); // Método para gerar valor entre 5 e 10
    }
}
