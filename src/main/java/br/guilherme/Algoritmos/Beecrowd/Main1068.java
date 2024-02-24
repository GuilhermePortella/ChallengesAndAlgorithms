package br.guilherme.Algoritmos.Beecrowd;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Main1068 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                String expressao = scanner.nextLine();

                boolean correct = true;
                int parentheses = 0;

                for (char letter : expressao.toCharArray()) {
                    if (letter == '(') {
                        parentheses++;
                    } else if (letter == ')') {
                        if (parentheses > 0) {
                            parentheses--;
                        } else {
                            correct = false;
                            break;
                        }
                    }
                }

                correct = correct && (parentheses == 0);

                System.out.println(correct ? "correct" : "incorrect");
            } catch (Exception e) {
                break;
            }
        }
    }

 
}