package br.guilherme.Algoritmos.Beecrowd;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Main1007 {
    
    public static void main(String[] args) {
        int a, b, c, d, diferenca;
        
        Scanner scr = new Scanner(System.in);
        
        a = scr.nextInt();
        b = scr.nextInt();
        c = scr.nextInt();
        d = scr.nextInt();
        
        diferenca = a * b - c * d;
        
        System.out.println("DIFERENCA = " + diferenca);  
    }
}
