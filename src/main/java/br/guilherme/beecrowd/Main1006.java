package br.guilherme.beecrowd;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Main1006 {
        public static void main(String[] args) {
        double a, b, c, media;
        
        Scanner scr = new Scanner(System.in);
        a = scr.nextDouble();
        b = scr.nextDouble();
        c = scr.nextDouble();
        
        media = (a * 2 + b * 3 + c * 5)/10;
        
        System.out.printf("MEDIA = %.1f%n", media);
    }
    
}
