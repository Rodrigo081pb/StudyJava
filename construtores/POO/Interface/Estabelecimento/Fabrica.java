package Interface.Estabelecimento;

import Interface.machine.Copiadora;
import Interface.machine.Digitalizadora;
import Interface.machine.EquipamentoMultifuncional;
import Interface.machine.Impressora;
import Interface.machine.Scanner;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional Equip = new EquipamentoMultifuncional();

        Scanner scanner = new Scanner();

        Impressora impressora = Equip;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = Equip;

        impressora.imprimir();
        digitalizadora.digitar();
        copiadora.copiar();
    }
}
