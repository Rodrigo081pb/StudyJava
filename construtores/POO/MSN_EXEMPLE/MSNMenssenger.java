package MSN_EXEMPLE;

public class MSNMenssenger extends ServicoMensagem {

    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo MSN Menssenger");
    }

    public void receberMensagem() {
        System.out.println("Recebendo menssagem pelo msn Menssenger");
    }
}
