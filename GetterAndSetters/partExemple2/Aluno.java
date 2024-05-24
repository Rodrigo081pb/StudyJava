public class Aluno {

    private String nome;
    private String nomePai;
    private String nomeMae;

    private String cpf;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        nome = newNome;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String newNomePai) {
        nomePai = newNomePai;
    }

    public String getnomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String newNomeMae) {
        nomeMae = newNomeMae;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int Newidade) {
        this.idade = Newidade;
    }

    public String getcpf() {
        return cpf;
    }

    public void setcpf(String string) {
        this.cpf = string;
    }
}
