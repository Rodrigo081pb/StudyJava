package lanchonete;

import lanchonete.cozinha.Almoxarife;
import lanchonete.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        // Ações que não precisam estarem disponíveis

        cozinheiro.lavarIngredientes();
        cozinheiro.fazerVitaminaLiquidificador();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.selecionarIngredientesLanche();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();

        // Ações que estabelecimento precisa ter ciência

        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();

        Almoxarife almoxarife = new Almoxarife();

        // Ações que não precisam estarem disponíveis

        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        // Ação que somente o seu pacote de cozinha precisa

        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();
        atendente.servirMesa();
        atendente.receberPagamento();

        // Ação que somente o seu pacote de cozinha precisa

        atendente.trocarGas();
        cozinheiro.PedirParatrocarGas(almoxarife);
    }
}
