package VeiculosExemploPoo;

//PROCEDIMENTOS
public class Carro extends Veiculo {

    public void ligar() {
        checaFarois();
        marcha();
        System.out.println("CARRO LIGADO");
    }

    // Implementando mais lógica.
    private void checaFarois() {
        System.out.println("Faróis ok");
    }

    private void marcha() {
        System.out.println("Marcha ok");
    }
}
