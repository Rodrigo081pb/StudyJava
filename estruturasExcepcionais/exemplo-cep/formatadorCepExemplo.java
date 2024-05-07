public class formatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("75145604");
            System.out.println("CEP formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
            System.err.println("Erro: CEP inválido!");
            e.printStackTrace(); // Isso imprime a pilha de chamadas, útil para depuração
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        // Simulando um CEP válido
        return "23.758-048";
    }
}

class CepInvalidoException extends Exception {
    // Implementação personalizada da exceção para representar um CEP inválido
}
