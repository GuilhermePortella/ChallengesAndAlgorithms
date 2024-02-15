package br.guilherme.Algoritmos.Beecrowd;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Main1008 {
    
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        
        int id, horas;
        double pagHoras, salario;
        
        id = scr.nextInt();
        horas = scr.nextInt();
        pagHoras = scr.nextDouble();
        
        salario = horas * pagHoras;
        
        System.out.printf("NUMBER = %d%n",id);
        System.out.printf("SALARY = U$ %.2f%n",salario);
    }
}
