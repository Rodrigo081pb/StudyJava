package edu.rodrigo.primeiroModel.operadores;

public class incrementacao {
    public static void main(String[] args) {
        int numero = 10;

        // x repetição

        numero = numero++;
        /*
         * Atribuição pra soma adiciona mais 1 e obviamente poderia ser -- fazendo a
         * decrementação de 1
         */

        // Poderia usar também aqui (numero++)
        System.out.println(numero);

        /*
         * 
         * Para o exemplo booleano seria
         * 
         * boolean variavel = true;
         * 
         * System.out.println(!variavel);
         * 
         * 
         */

    }
}
