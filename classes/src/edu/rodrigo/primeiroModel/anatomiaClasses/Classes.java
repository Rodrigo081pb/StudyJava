package edu.rodrigo.primeiroModel.anatomiaClasses;

public class Classes {

    // Método principal - main sendo o padrão conforme o abaixo
    public static void main(String[] args) {

        // // Como imprimir uma mensagem
        // System.out.print("Hello world isso é minha palavra dentro de um método");

        // // Declarando uma váriavel

        // // int ano = 2024;
        // // final String BR = "Brasil";

        // Chamando o método subMain pra o método principal
        subMain(args);

    }

    public static void subMain(String[] args) {
        String primeiroNome = "Joyce";
        String segundoNome = "Pinheiro";
        // Método
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return primeiroNome.concat(" ").concat(segundoNome);
    }

}