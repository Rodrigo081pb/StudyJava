package edu.rodrigo.primeiroModel.metodos;

public class SmartTv {

    boolean ligada = true;
    int canal = 1;
    int volume = 20;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Você aumentou de canal: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Você diminuiu de canal: " + canal);
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

}
