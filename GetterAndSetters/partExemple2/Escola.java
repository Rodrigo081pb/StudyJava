public class Escola {
    public static void main(String[] args) {
        Aluno rodrigo = new Aluno();
        rodrigo.setNome("Rodrigo");
        rodrigo.setNomeMae("Joyce Maria");
        rodrigo.setNomePai("Rodrigo Marinho");

        rodrigo.setIdade(20);
        rodrigo.setcpf("999-999-999-99");

        System.out.println("-----------------------------------------------------------");
        System.out.println("-----               Cadastro Estudantil              ------");
        System.out.println("---                                                      --");
        System.out.println("----------------------------Aluno:" + rodrigo.getNome() + "--");
        System.out.println("--Idade:" + rodrigo.getIdade() + "---------------------------");
        System.out.println("--Cadastro de Pessoas Físicas(CPF):" + rodrigo.getcpf() + "--");
        System.out.println("--Pai:" + rodrigo.getNomePai() + "---------------------------");
        System.out.println("--Mãe:" + rodrigo.getnomeMae() + "---------------------------");
    }
}