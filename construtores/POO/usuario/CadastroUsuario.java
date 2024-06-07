/*
 Segue exemplo do professor abaixo: 


 -muitas vezes já queremos que na criação(instanciação) de um objeto, a linguagem já solicite para quem for criar este novo objeto defina algumas propriedades essenciais. 

 abaixo iremos ilustrar uma classe onde supostamente seria um cadastro de usuário onde a class CadastroUsuario onde a mesma terá atributos: Nome,CPF, CEP.


 */

public class CadastroUsuario {

    private String name;
    private String cpf;
    private String cep;

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCep() {
        return cep;
    }
}
