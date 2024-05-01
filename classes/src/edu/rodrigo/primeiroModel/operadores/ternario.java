package edu.rodrigo.primeiroModel.operadores;

public class ternario {

    public static void main(String[] args) {
        int a, b;

        a = 80;
        b = 100;
        String resultado = "";

        // Exemplo de condicional utilizando uma estrutura IF/ELSE
        if (a == b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";

        System.out.println(resultado);

        // Utilizando o operador ternário

        /*
         * String resultado = a == b ? "verdadeiro" : "falso";
         */

        // se caso a string apresentada no resultado for igual a outra entao vai dar
        // verdadeiro tipo se A for igual a B ? "verdadeiro" : "falso";

        // tipo o ? representa o entao tipo caso aquela operação for verdadeira e o :
        // seria a o senão
    }
}
