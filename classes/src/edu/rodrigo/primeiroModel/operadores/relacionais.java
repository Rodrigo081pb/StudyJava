package edu.rodrigo.primeiroModel.operadores;

public class relacionais {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        if (number1 > number2) {
            System.out.println(
                    "O numero 1 é maior que o numero 2 porque o numero 1 é " + number1 + " Já o numero 2 é " + number2);
        } else if (number1 < number2) {
            System.out.println(
                    "O numero 1 é menor que o numero 2 porque o número 1 é " + number1 + " Já o numero 2 é " + number2);
        } else {
            System.out.println("O numero 1 é igual a o numero 2");
        }
    }
}
