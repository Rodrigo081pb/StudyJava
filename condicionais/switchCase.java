public class switchCase {
    public static void main(String[] args) {
        String tamanho = "A";

        switch (tamanho) {
            case "P1": {
                System.out.println("Pequeno");
            }
            case "M": {
                System.out.println("MEDIO");
            }
            case "G": {
                System.out.println("Grande");
            }
            default: {
                System.out.println("INDEFINIDO");
            }
        }
    }
}