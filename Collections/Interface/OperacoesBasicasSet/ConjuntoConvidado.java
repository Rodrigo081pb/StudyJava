import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    // Atributo

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int numeroConvite) {
        convidadoSet.add(new Convidado(nome, numeroConvite));
    }

    public void removerConvidadoPorNumeroConvite(int numeroConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getNumeroConvite() == numeroConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado ConjuntoConvidado = new ConjuntoConvidado();
        System.out.println(
                "Existem " + ConjuntoConvidado.contarConvidados() + "  convidados dentro do Set de convidados");

        ConjuntoConvidado.adicionarConvidado("Julia", 1235);
        ConjuntoConvidado.adicionarConvidado("Kauã", 1205);
        ConjuntoConvidado.adicionarConvidado("Savio", 1205);

        ConjuntoConvidado.removerConvidadoPorNumeroConvite(1205);
        System.out.println("  convidados dentro do Set de convidados");
    }
}
