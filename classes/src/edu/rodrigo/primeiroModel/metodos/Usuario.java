package edu.rodrigo.primeiroModel.metodos;

public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual :" + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal atual :" + smartTv.canal);

        System.out.println("Volume Atual : " + smartTv.volume);

        System.out.println("A TV está ligada ?" + smartTv.ligada);

        System.out.println("Volume atual :" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> : TV Ligada ?" + smartTv.ligada);

    }
}
