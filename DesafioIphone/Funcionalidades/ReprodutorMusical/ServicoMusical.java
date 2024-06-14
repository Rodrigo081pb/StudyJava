package ReprodutorMusical;

public class ServicoMusical implements SelecionarMusica, Tocar, Pausar {

    @Override
    public void pausar() {
        System.out.println("Pausando Música");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando JayahLook :>");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a Música");
    }

}
