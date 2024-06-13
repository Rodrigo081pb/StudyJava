package MSN_EXEMPLE;

public class FacebookMenssenger extends ServicoMensagem {
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando Menssagem pelo Facebook Menssenger");
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo Facebook Menssenger");
    }
}
