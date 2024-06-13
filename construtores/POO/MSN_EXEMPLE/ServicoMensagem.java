package MSN_EXEMPLE;

public abstract class ServicoMensagem {

    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    // Somente os filhos conhecem este método

    protected void validarConexaoInternet() {
        System.out.println("Validando conexão com a internet");
    }
}
