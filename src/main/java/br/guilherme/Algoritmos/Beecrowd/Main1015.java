package br.guilherme.Algoritmos.Beecrowd;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Main1015 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double x1 = scr.nextDouble();
        double y1 = scr.nextDouble();
        double x2 = scr.nextDouble();
        double y2 = scr.nextDouble();
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.printf("%.4f%n",distancia);
    }

}
