package desafiosjava;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class AnalistaCandidatos {
    public static void main(String[] args) {
        // System.out.println("Processo Seletivo: ");
        // analisarCandidato(19000.1);
        // analisarCandidato(2000.1);
        // analisarCandidato(2000.0);
        // analisarCandidato(1000.0);

        String[] candidatos = { "Felipe", "Rodrigo", "Kauã", "Sheila", "Matheus" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            // Precisa sofrer alteração se não fica infinito
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com o " + candidato + " na " + tentativasRealizadas + " tentativa");
        } else {
            System.out.println(
                    "Não conseguimos contato com o " + candidato + " número máximo tentativas " + tentativasRealizadas);
        }

    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void DemonstrandoCandidatosSelecionados() {
        String[] candidatos = { "Felipe", "Rodrigo", "Kauã", "Sheila", "Matheus" };
        System.out.println("Imprimindo a lista de candidatos informando o indice de cada um"); // For tradicional

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n°" + indice + "é" + candidatos[indice]);
        }

        // Forma abreviada de interação utilizando o for each

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Felipe", "Rodrigo", "Kauã", "Sheila", "Matheus", "Sandra", "Felicity", "Ibrahim" };

        int candidatosEscolhidos = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosEscolhidos < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioEscolhido = salarioEscolhido();

            System.out.println("O candidato " + candidato + " solicitou esse valor de salário " + salarioEscolhido);

            if (salarioBase >= salarioEscolhido) {
                System.out.println("O candidato " + candidato + " foi escolhido");
                candidatosEscolhidos++; // Incrementando o número de candidatos selecionados
            }
            candidatosAtual++;
        }

    }

    static void analisarCandidato(double salarioEscolhido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioEscolhido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioEscolhido) {
            System.out.println("Ligar para o candidato para uma contra proposta");
        } else {
            System.out.println("Aguardando outros candidatos responderem");
        }
    }

    // Método para gerar um salário escolhido aleatoriamente (apenas para fins de
    // exemplo)
    static double salarioEscolhido() {
        return ThreadLocalRandom.current().nextDouble(1000.0, 5000.0);
    }
}
