/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.guilherme.Algoritmos.Beecrowd;

import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Guilherme
 */
public class MainT {
 
    public static void main(String[] args) throws IOException {
 
        int a, b, x;
        Scanner scr = new Scanner(System.in);
        a = scr.nextInt();
        b = scr.nextInt();
        x = a + b;
        System.out.println("X = " + x);
    }
    
    static int soma(int a , int b){
        return a + b;
    }
 
}