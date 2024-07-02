import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemple {
    public static void main(String[] args) {
        // Usar o Supplier com expressao Lambda para fornecer uma saudação
        // personalizada.
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)";

        // Usar o Supplier
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());

        // Imprimir as saudações geradas
        listaSaudacoes.forEach(s -> System.out.println(s));

    }
}
