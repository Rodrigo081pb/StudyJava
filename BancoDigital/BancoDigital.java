import java.util.ArrayList;
import java.util.List;

// Classe abstrata Conta
abstract class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public abstract void exibirTipoConta();
}

// Classe ContaCorrente
class ContaCorrente extends Conta {
    public ContaCorrente(String numero) {
        super(numero);
    }

    @Override
    public void exibirTipoConta() {
        System.out.println("Conta Corrente");
    }
}

// Classe ContaPoupanca
class ContaPoupanca extends Conta {
    public ContaPoupanca(String numero) {
        super(numero);
    }

    @Override
    public void exibirTipoConta() {
        System.out.println("Conta Poupança");
    }
}

// Classe Banco
class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void criarContaCorrente(String numero) {
        contas.add(new ContaCorrente(numero));
    }

    public void criarContaPoupanca(String numero) {
        contas.add(new ContaPoupanca(numero));
    }

    public Conta encontrarConta(String numero) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }

    /* Função de depósito */
    public void depositar(String numero, double valor) {
        Conta conta = encontrarConta(numero);
        if (conta != null) {
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    /* Função de Saque */
    public void sacar(String numero, double valor) {
        Conta conta = encontrarConta(numero);
        if (conta != null) {
            conta.sacar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    /* Função de Exibição de Saldo */
    public void exibirSaldo(String numero) {
        Conta conta = encontrarConta(numero);
        if (conta != null) {
            System.out.println("Saldo da conta " + numero + ": " + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}

// Classe principal para testar o banco
public class BancoDigital {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.criarContaCorrente("12345");
        banco.criarContaPoupanca("67890");

        banco.depositar("12345", 1000);
        banco.sacar("12345", 500);

        banco.exibirSaldo("12345");

        banco.depositar("67890", 2000);
        banco.sacar("67890", 1500);

        banco.exibirSaldo("67890");
    }
}
