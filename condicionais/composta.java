public class composta /* e encadeada ao mesmo tempo */ {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if ((nota <= 5) && (nota >= 6)) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
