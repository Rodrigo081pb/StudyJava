public class simples {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 14.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Valor de saque não condiz com o saldo: " + saldo);
        }

        System.out.println("Seu saldo é: " + saldo);

    }
}
