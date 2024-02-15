package br.guilherme.Algoritmos.Beecrowd;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Main1013 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scr = new Scanner(System.in);
        a = scr.nextInt();
        b = scr.nextInt();
        c = scr.nextInt();
        
        System.out.printf("%d eh o maior%n",maior(a, maior(b, c)));
    }
    static int maior(int a, int b) {
        int maior = 0;
        maior = (a + b + Math.abs(a - b)) / 2;
        return maior;
    }
}