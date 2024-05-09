package exemploFormatText.utilizandoThrows;

public class ExemploLetraAcomThrows extends Exception {
    @Override
    public String getMessage() {
        return "Não foi encontrada a letra A em sua palavra.";
    }

    public static void main(String args[]) throws ExemploLetraAcomThrows {
        String frase = "Sou um teste!";
        if (!frase.contains("b") || !frase.contains("B"))
            throw new ExemploLetraAcomThrows();
    }
}