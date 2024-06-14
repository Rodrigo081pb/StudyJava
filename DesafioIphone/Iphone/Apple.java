import AparelhoTelefonico.ServicoTelefonico;
import NavegadorInternet.ServicoInternet;
import ReprodutorMusical.ServicoMusical;

public class Apple {
    public static void main(String[] args) {
        ServicoTelefonico tele = new ServicoTelefonico();
        ServicoInternet net = new ServicoInternet();
        ServicoMusical spotify = new ServicoMusical();

        ServicoTelefonico telefone = tele;
        ServicoInternet netFone = net;
        ServicoMusical music = spotify;

        telefone.ligar();
        netFone.exibirPagina();
        music.tocar();

    }
}
