package edu.rodrigo.primeiroModel.operadores;

public class logico {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;

        int i = 2;

        // Quando eu quero verificar

        if ((condicao1 && condicao2) && (i % 2 == 0)) {
            System.out.println("As duas condições são verdadeiras");
        } else if (condicao1 || condicao2) {
            System.out.println("Umas das condições é verdadeira");
        } else {
            System.out.println("Nenhuma das condições são verdadeiras");
        }
    }
}
/*
 * O operador lógico representa o recurso que nos permite criar expressões
 * lógicas maiores a partir da junção de duas ou mais expressões
 * 
 * Tabela verdade
 * 
 * ° && Operador Lógico "E" - ele verifica se ambas são iguais e executa
 * ° || Operador Lógico "Ou" - O ou ele verifica se uma das condições são
 * verdadeiras e executa
 * 
 */