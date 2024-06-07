package Enums.EnumTypes.exemplo1;

/*
    Estados brasileiros: São Paulo, Rio de Janeiro, Piauí, Pernambuco.
 */

public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo"),
    RIO_JANEIRO("RJ", "Rio de Janeiro "),
    PIAUI("PI", "Piauí"),
    PERNAMBUCO("PE", "Pernambuco");
    // insira mais estados aqui

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return nome;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

}