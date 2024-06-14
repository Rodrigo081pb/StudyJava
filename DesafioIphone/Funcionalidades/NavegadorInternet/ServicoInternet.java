package NavegadorInternet;

public class ServicoInternet implements AdicionarNovaAba, AtualizarPagina, ExibirPagina {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página!!!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Criando Nova Aba");
    }

}
