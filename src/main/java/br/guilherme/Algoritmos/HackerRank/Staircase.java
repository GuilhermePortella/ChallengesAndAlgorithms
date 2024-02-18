package br.guilherme.Algoritmos.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Guilherme
 */
public class Staircase {

    public static void staircase(int n) {

        for (int i = 1; i <= n; i++) {
            String espaco = " ".repeat(n - i);
            String print = "#".repeat(i);
            System.out.println(espaco + print);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        staircase(n);
        bufferedReader.close();
    }
}
