package br.guilherme.beecrowd;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Main1002 {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        
        double pi = 3.14159;
        System.out.println("Digite  o raio");
        double raio = scr.nextDouble();
        String area = calcularArea(pi,raio);
        
        System.out.println(area);
    }
    
    static String calcularArea(double pi, double raio){
        double resultado = pi * Math.pow(raio, 2); 
        String resultadoToSstring = String.format("%.4f", resultado);
        return resultadoToSstring;
    }
}
