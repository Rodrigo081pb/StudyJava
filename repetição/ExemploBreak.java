public class ExemploBreak {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println("Contador do loop externo: " + i);
            System.out.print(" Contador do loop interno: ");

            // O loop Interno
            for (int j = 0; j <= 100; j += 2) {
                System.out.print(j + " ");

                // Finaliza o Loop se j = 50
                if (j == 50)
                    break;

            }
            System.out.println(); // Apenas pula uma linha
        }

        System.out.println("Contagem finalizada... :/");

        /*
         * Exemplo abaixo pra contar de 1 até 20 utilizando loops Externos e internos
         * 
         * Nessa estrutura de código ele vai executar o loop interno até ser < 100 ele
         * vai executar inicialmente o contador externo ou seja ele vai mostrar em qual
         * indice ele está sendo contado a partir do 0 até ser < 100 e ocontador do loop
         * interno também vai ser contado no caso exibido que está sendo pulado de 2 em
         * dois ou seja vai começar no 0 e vai de 2 em 2 - 0 2 4 6 8 10... e por ai vái
         * porém ele vai ser quebrado assim que chegar no 50 como mostrado no trecho de
         * código
         * 
         * se j == 50 então para
         * if(j == 20) break;
         * 
         * apos finalizar o código vai exibir obviamente o contador
         * 
         * System.out.println()
         * 
         * e após sair do trecho de código vai exibir uma mensagem.
         * 
         * System.out.println("Contagem finalizada... :/")
         * 
         */

        // Loop Externo

    }
}
