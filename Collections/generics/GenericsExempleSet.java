import java.util.HashSet;
import java.util.Set;

public class GenericsExempleSet {
    public static void main(String[] args) {
        /*
         * Exemplo sem a utilização do generics
         * Set conjuntoSemGenerics = new HashSet();
         * conjuntoSemGenerics.add("Primeiro elemento sem a utilização do generics");
         * conjuntoSemGenerics.add(20);
         * 
         */

        // Exemplo com a utilização do generics
        Set<String> conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("Elemento 1 com a utilização do generics");
        conjuntoGenerics.add("Elemento 2 com a utilização do generics");

        // Iterando sobre o conjunto com a utilização do generics
        for (String elemento : conjuntoGenerics) {
            System.out.println(elemento);
        }

        /*
         * Iterando sobre o conjunto sem a utilização do generics
         * for (Objetc elemento : conjuntoGenerics) {
         * String str = (String) elemento;
         * System.out.println(str);
         * }
         * 
         */

    }
}
