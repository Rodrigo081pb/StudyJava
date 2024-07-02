
/*
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
 * 
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemple {

    public static void main(String[] args) {
        // Criando lista de palavras
        List<String> palavras = Arrays.asList("Java", "JavaScript", "Gym", "Hardstyle");

        // Criar um predicate que verifica se a palavra que tem mais caracteres
        Predicate<String> cincoCaracteres = palavra -> palavra.length() > 5;

        // Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em
        // seguida,
        // imprimir cada palavra que passou no filtro criado.

        palavras.stream()
                .filter(cincoCaracteres)
                .forEach(System.out::println);

    }

}
