public class Convidado {
    // Atributos
    private String nome;

    private int numeroConvite;

    public Convidado(String nome, int numeroConvite) {
        this.nome = nome;
        this.numeroConvite = numeroConvite;
    }

    // Getters

    public String getNome() {
        return nome;
    }

    public int getNumeroConvite() {
        return numeroConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", numeroConvite=" + numeroConvite +
                '}';
    }

}
