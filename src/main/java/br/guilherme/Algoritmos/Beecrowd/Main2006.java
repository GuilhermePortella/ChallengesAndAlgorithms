package br.guilherme.Algoritmos.Beecrowd;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Main2006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tipoReal = scanner.nextInt();

        int[] respostas = new int[5];
        for (int i = 0; i < respostas.length; i++) {
            respostas[i] = scanner.nextInt();
        }

        int corretas = 0;

        for (int resposta : respostas) {
            if (resposta == tipoReal) {
                corretas++;
            }
        }

        System.out.println(corretas);
    }
}
