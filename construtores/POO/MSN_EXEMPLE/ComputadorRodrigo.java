package MSN_EXEMPLE;

public class ComputadorRodrigo {
    public static void main(String[] args) {
        // Abrindo Aplicativo.
        ServicoMensagem sm = null;

        String appEscolha = "msn";

        if (appEscolha.equals("msn")) {
            sm = new MSNMenssenger();
        } else if (appEscolha.equals("fbc")) {
            sm = new FacebookMenssenger();
        } else if (appEscolha.equals("tl")) {
            sm = new TelegramMenssenger();
        }

        sm.enviarMensagem();
        sm.receberMensagem();
    }
}
