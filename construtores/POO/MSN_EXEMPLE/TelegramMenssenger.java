package MSN_EXEMPLE;

public class TelegramMenssenger extends ServicoMensagem {

    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando Mensagem pelo Telegram Menssenger");
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo Telegram Menssenger");
    }

}
