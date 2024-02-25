package br.guilherme.Algoritmos.Beecrowd;

import java.util.*;

/**
 *
 * @author Guilherme
 */
public class Main2370 {

    String nome;
    int hab;

    public Main2370(String nome, int hab) {
        this.nome = nome;
        this.hab = hab;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nj = scanner.nextInt();
        int nt = scanner.nextInt();

        Main2370[] vjog = new Main2370[10005];
        for (int i = 0; i < nj; i++) {
            vjog[i] = new Main2370(scanner.next(), scanner.nextInt());
        }

        Arrays.sort(vjog, 0, nj, Comparator.comparingInt(a -> -a.hab)); // Ordem decrescente de hab

        List<Main2370>[] vtime = new ArrayList[nt];
        for (int i = 0; i < nt; i++) {
            vtime[i] = new ArrayList<>();
        }

        for (int i = 0; i < nj; i++) {
            vtime[i % nt].add(vjog[i]);
        }

        for (int i = 0; i < nt; i++) {
            System.out.println("Time " + (i + 1));
            Collections.sort(vtime[i], Comparator.comparing(a -> a.nome)); // Ordem alfabética de nome
            for (Main2370 jogador : vtime[i]) {
                System.out.println(jogador.nome);
            }
            System.out.println();
        }
    }

}
