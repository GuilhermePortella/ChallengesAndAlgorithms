package br.guilherme.beecrowd;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Main1014 {
    
    public static void main(String[] args) {
        double distancia;
        double combustivel;
        Scanner scr = new Scanner(System.in);
        
        distancia = scr.nextDouble();
        combustivel = scr.nextDouble();
        
        double saida ;
        saida = distancia/combustivel;
        
        System.out.printf("%.3f km/l%n",saida);
    }
    
}
