package Interface.machine;

public class EquipamentoMultifuncional implements Digitalizadora, Impressora, Copiadora {

    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento da fábrica Multifuncional EQUIP ");
    }

    @Override
    public void imprimir() {
        System.out.println("Im´primindo via equipamento da fábrica Multifuncional EQUIP ");
    }

    @Override
    public void digitar() {
        System.out.println("Digitalizando via equipamento da fábrica Multifuncional EQUIP");
    }

}
