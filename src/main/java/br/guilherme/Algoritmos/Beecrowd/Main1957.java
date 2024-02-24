package br.guilherme.Algoritmos.Beecrowd;

import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Guilherme
 */
public class Main1957 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        String hex = Integer.toHexString(v).toUpperCase();
        System.out.println(hex);
        sc.close();
    }

}
