package Enums.EnumTypes.exemplo1;

/*
    Estados brasileiros: São Paulo, Rio de Janeiro, Piauí, Pernambuco.
 */

public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo", 11),
    RIO_JANEIRO("RJ", "Rio de Janeiro ", 71),
    PIAUI("PI", "Piauí", 78),
    PERNAMBUCO("PE", "Pernambuco", 81);
    // insira mais estados aqui

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getSigla() {
        return nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

}