package VeiculosExemploPoo;

public class Autodromo {
    public static void main(String[] args) {
        Carro Fiat = new Carro();
        Fiat.setChassi("8742BC");
        // Fiat.ligar();

        Moto honda160fan = new Moto();
        honda160fan.setChassi("7776MTUE");
        // honda160fan.ligar();

        Veiculo coringa = Fiat;

        coringa.ligar();
    }

}
