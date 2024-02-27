package br.guilherme.Algoritmos.Beecrowd;

import java.util.Scanner;


/**
 *
 * @author Guilherme
 */
public class Main1017 {
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempoViagem = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();

        int distanciaPercorrida = tempoViagem * velocidadeMedia;

        double consumoCombustivel = distanciaPercorrida / 12.0;

        System.out.printf("%.3f\n", consumoCombustivel);
    }
    
}
