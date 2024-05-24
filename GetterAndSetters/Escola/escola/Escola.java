package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        felipe.nome = "Felipe";
        felipe.idade = 10;

        System.out.println("O aluno: " + felipe.nome + "Tem" + felipe.idade + "Anos");
    }

}
