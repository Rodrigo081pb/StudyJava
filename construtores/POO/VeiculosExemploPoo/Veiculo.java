package VeiculosExemploPoo;

// Abstrada é porque a classe ela não sabe como algumas coisas acontecem para casos específicos
public abstract class Veiculo {
    private String chassi;

    public String Chassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar();
}
