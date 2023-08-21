package br.guilherme.beecrowd;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Main1016 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int km = scr.nextInt();
        int min = (60 * km) / 30;
        System.out.printf("%d minutos%n",min);
    }

}
