package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Cliente {
    public void escolherLanche() {
        System.out.println("Escolhendo o lanche");
    }

    public void fazerPedido() {
        System.out.println("Fazendo o pedido");
    }

    public void pagarConta() {
        System.out.println("Pagando conta");
    }

    public void consultarSaldoAplicativo() {
        System.out.println("Consultando saldo no aplicativo do picPix");
    }

    public void pegarPedidoBalcao() {
        System.out.println("Pegando o pedido no balcão");
    }

}