package br.guilherme.beecrowd;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Main1012 {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        
        double a, b, c;
        a = scr.nextDouble();
        b = scr.nextDouble();
        c = scr.nextDouble();
        
        double areaTriangulo = (a * c)/2;
        
        double areaCirculo;
        double pi = 3.14159;
        areaCirculo = (pi * Math.pow(c, 2));
        
        double areaTrapezio = ((a+b)/2)*c;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;
        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
        
    }
    
}
