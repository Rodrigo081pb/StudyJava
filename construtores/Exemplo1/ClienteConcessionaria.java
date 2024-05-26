public class ClienteConcessionaria {

    private String nome;
    private String cpf;
    private String endereco;

    public ClienteConcessionaria(String cpf, String nome, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setEndereco(String newEndereco) {
        this.endereco = newEndereco;
    }

}
