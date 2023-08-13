package br.guilherme.beecrowd;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Main1005 {
    
    public static void main(String[] args) {
        double a, b, media;
        
        Scanner scr = new Scanner(System.in);
        a = scr.nextDouble();
        b = scr.nextDouble();
        
        media = (a * 3.5 + b * 7.5)/11;
        
        System.out.printf("MEDIA = %.5f%n", media);
    }
    
}
