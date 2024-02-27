package br.guilherme.Algoritmos.Beecrowd;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Main1019 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int segundos = scanner.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        segundos %= 60;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }
}
