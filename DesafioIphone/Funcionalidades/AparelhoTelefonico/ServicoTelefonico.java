package AparelhoTelefonico;

public class ServicoTelefonico implements Atender, CorreioDeVoz, Ligar {

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void mensagensDeVoz() {
        System.out.println("Recebendo mensagem de voz");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

}
