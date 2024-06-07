package Enums.EnumTypes.exemplo1;

public class SystemIBGE {
    public static void main(String[] args) {
        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + "-" + e.getNome() + "-" + e.getIbge());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.PERNAMBUCO;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.print(eb.getIbge());
    }
}
