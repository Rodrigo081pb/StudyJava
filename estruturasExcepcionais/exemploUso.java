import java.util.Scanner;

class Cliente {
    private String nome;
    private String sobrenome;
    private String numero;
    private String email;

    // Construtor para inicializar os atributos do cliente
    public Cliente(String nome, String sobrenome, String numero, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numero = numero;
        this.email = email;
    }

    // Método para representar o cliente como uma String
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", numero='" + numero + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class exemploUso {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        try { // Inicia o bloco try
            System.out.println("Digite seu nome:"); // Solicita ao usuário que insira o nome
            String nome = scanner.nextLine(); // Lê o nome fornecido pelo usuário

            System.out.println("Digite seu sobrenome:"); // Solicita ao usuário que insira o sobrenome
            String sobrenome = scanner.nextLine(); // Lê o sobrenome fornecido pelo usuário

            System.out.println("Digite seu número:"); // Solicita ao usuário que insira o número
            String numero = scanner.nextLine(); // Lê o número fornecido pelo usuário

            System.out.println("Digite seu email:"); // Solicita ao usuário que insira o email
            String email = scanner.nextLine(); // Lê o email fornecido pelo usuário

            // Cria um objeto cliente com os dados fornecidos pelo usuário

            // Simula o salvamento dos dados do cliente em um banco de dados
            System.out.println("Cliente registrado com sucesso:");
            // Imprime os detalhes do cliente registrado
        } catch (Exception e) { // Captura qualquer exceção que possa ocorrer dentro do bloco try
            System.out.println("Ocorreu um erro ao registrar o cliente: " + e.getMessage()); // Exibe uma mensagem de
                                                                                             // erro
        } finally { // Bloco finally, independente de ocorrer uma exceção ou não, é executado
            scanner.close(); // Fecha o objeto Scanner para liberar recursos
            System.out.println("Programa encerrado."); // Mensagem final exibida ao usuário
        }
    }
}

// Importa a classe Scanner para facilitar a entrada de dados do usuário
// Classe que representa um cliente do banco
// Classe principal que contém o método main
