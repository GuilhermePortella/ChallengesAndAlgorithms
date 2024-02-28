package br.guilherme.Algoritmos.HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Guilherme
 */
public class NumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        if (x1 == x2) {
            return "YES";
        }if (x1 > x2 && v1 >= v2) {
            return "NO";
        }if (x2 > x1 && v2 >= v1) {
            return "NO";
        }

        // equation to find t
        // x1 + v1 * t = x2 + v2 * t
        // v1 * t - v2 * t = x2 - x1
        // t = (x2 - x1) / (v1 - v2)
        double t = 1d * (x2 - x1) / (v1 - v2);

        return t % 1 == 0 ? "YES" : "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
