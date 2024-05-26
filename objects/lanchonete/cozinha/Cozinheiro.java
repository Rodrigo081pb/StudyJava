package lanchonete.cozinha;

import lanchonete.Atendente;

public class Cozinheiro {
    // Default
    public void adicionarLancheNoBalcao() {
        System.out.println("Adiconando lanche no balcão");
    }

    // Default
    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco no balcão");
    }

    // Default
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    // Default
    public void prepararLanche() {
        System.out.println("Preparando lanche");
    }

    // Default
    public void prepararVitamina() {
        System.out.println("Preparando vitamina");
    }

    // Default
    public void selecionarIngredientesLanche() {
        System.out.println("Selecionando o pão, salada, hamburguer");
    }

    // default
    public void selecionarIngredientesVitamina() {
        System.out.println("Selecionando Fruta leite e água");
    }

    public void lavarIngredientes() {
        System.out.println("Lavando ingredientes");
    }

    // Default
    public void fazerVitaminaLiquidificador() {
        System.out.println("Batendo vitamina no liquidificador");
    }

    // Default
    public void fritarIngredientesLanche() {
        System.out.println("Fritando hamburguer e carne e ovo");
    }

    // Default
    public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }

    // Default
    public void PedirParatrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }

}
