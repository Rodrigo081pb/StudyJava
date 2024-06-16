import java.util.HashMap;
import java.util.Map;

public class GenericsExempleMap {
    public static void main(String[] args) {

        /*
         * // Exemplo sem Generics
         * Map mapaSemGenerics = new HashMap();
         * mapaSemGenerics.put("Chave 1", 20);
         * mapaSemGenerics.put("Chave 2", 30); // Permite adicionar qualquer tipo de
         * objeto
         * 
         */

        // Exemplo com a utilização do Generics
        Map<String, Integer> mapaGenerics = new HashMap<>();
        mapaGenerics.put("Chave 1", 20);
        mapaGenerics.put("Chave 2", 30);

        // Iterando sobre o mapa com a utilizsação do Generics
        for (Map.Entry<String, Integer> entry : mapaGenerics.entrySet()) {
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

        // Iterando sobre o mapa sem a utilização do Generics (Necessário fazer cast)

        /*
         * for (Objetc obj : mapaSemGenerics.entrySet()) {
         * Map.Entry entry = (Map.entry) obj;
         * String chave = (String) obj;
         * String valor = entry.getValue();
         * System.out.println("Chave: " + chave + ", Valor: " + valor);
         * }
         */

    }
}
