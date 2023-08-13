package br.guilherme.beecrowd;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Main1010 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        
        int codPeca1;
        int numPecas1;
        double valorPeca1;
        int codPeca2;
        int numPecas2;
        double valorPeca2;
                 
        codPeca1 = scr.nextInt();
        numPecas1 = scr.nextInt();
        valorPeca1 = scr.nextDouble();
        
        codPeca2 = scr.nextInt();
        numPecas2 = scr.nextInt();
        valorPeca2 = scr.nextDouble();
        
        valorPeca1 = numPecas1 * valorPeca1;
        valorPeca2 = numPecas2 * valorPeca2;
        double total = valorPeca1+valorPeca2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);   
    }
}