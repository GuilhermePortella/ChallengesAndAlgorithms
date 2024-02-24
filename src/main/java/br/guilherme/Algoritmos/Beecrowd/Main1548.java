package br.guilherme.Algoritmos.Beecrowd;

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Guilherme
 */
public class Main1548 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int testCase = 0; testCase < N; testCase++) {
            int M = scanner.nextInt();
            int[] notas = new int[M];

            for (int i = 0; i < M; i++) {
                notas[i] = scanner.nextInt();
            }

            int resultado = contarAlunosQueNaoPrecisamTrocar(M, notas);
            System.out.println(resultado);
        }

        scanner.close();
    }

    private static int contarAlunosQueNaoPrecisamTrocar(int M, int[] notas) {
        int naoPrecisamTrocar = 0;

        int[] notasOrdenadas = notas.clone();
        Arrays.sort(notasOrdenadas);

        for (int i = 0; i < M; i++) {
            if (notas[i] == notasOrdenadas[M - 1 - i]) {
                naoPrecisamTrocar++;
            }
        }

        return naoPrecisamTrocar;
    }
    
}
