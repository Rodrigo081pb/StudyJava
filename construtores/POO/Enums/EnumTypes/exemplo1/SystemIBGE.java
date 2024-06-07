package Enums.EnumTypes.exemplo1;

public class SystemIBGE {
    public static void main(String[] args) {
        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + "-" + e.getNome());
        }
    }
}
