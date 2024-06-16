import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args) {

        /*
         * Exemplo sem a utilização do Generics
         * 
         * List listaSemGenerics = new ArrayList();
         * listaSemGenerics.add("Primeiro elemento");
         * listaSemGenerics.add(10);
         * 
         */

        // Lista com a utilização do Generics

        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Primeiro elemento com a utilização do Generics");
        listaGenerics.add("Segundo elemento com a utilização do Generics");

        // Iterando sobre a lista com a Utilização do Generics
        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }

        /*
         * Iterando sobre a lista sem a utilização do Generics(necessário fazer cast)
         * for (Object elemento : listaSemGenerics) {
         * String str = (String) elemento;
         * System.out.println(str);
         * }
         */
    }
}
