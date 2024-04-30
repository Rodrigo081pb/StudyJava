package edu.rodrigo.primeiroModel.variaveis;

public class Tipos {
    double salarioMinimo = 2500;
    int cep = 2345633; // Caso comece com 0 é string o mesmo se aplica pra outros que comecem com 0
    long cpf = 23443204565L; // Se torna necessário ser adicionado o L ao final
    float pi = 3.14F; // Se torna necessário adicionar um F ao final

    short numeroCurto = 1; // Comporta mais de 30.000 números.
    int numeroNormal1 = numeroCurto;
    short numeroCurto2 = (short) numeroNormal1;

    // Constante em caixa alta

    int numero = 5;

    public void atribuirNumero() {
        numero = 10;
    }

    public void impressao() {
        System.out.println(numero);
    }

    // Constante
    final double VALOR_DE_PI = 3.14;

}
