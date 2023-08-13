package br.guilherme.beecrowd;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Main1011 {
    
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        
        float raio;
        double resultado;
        double pi =  3.14159;
        
        raio = scr.nextFloat();
        
        resultado = (4/3.0) * pi * Math.pow(raio, 3);
        
        System.out.printf("VOLUME = %.3f%n", resultado);
    }   
}