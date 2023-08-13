package br.guilherme.beecrowd;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Main1009 {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        
        String nomeVendedor;
        double salarioFix, vendasTotais;
        double comissao;
        
        nomeVendedor = scr.next();
        salarioFix = scr.nextDouble();
        vendasTotais = scr.nextDouble();
        comissao = vendasTotais * 0.15;
        double total = salarioFix + comissao;
        System.out.printf("TOTAL = R$ %.2f%n", total);
    }
    
}
