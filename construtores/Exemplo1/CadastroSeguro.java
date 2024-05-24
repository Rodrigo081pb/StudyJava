public class CadastroSeguro {
    public static void main(String[] args) {
        // Corrigido: Ordem dos parâmetros e adicionando o parametro endereco
        Cliente rodrigo = new Cliente("99999999999", "Rodrigo", "InicialEndereco");

        rodrigo.setEndereco("Rua das avenidas");

        System.out.println("Nome: " + rodrigo.getNome());
        System.out.println("CPF: " + rodrigo.getCpf());
        System.out.println("Endereço: " + rodrigo.getEndereco());
    }
}
