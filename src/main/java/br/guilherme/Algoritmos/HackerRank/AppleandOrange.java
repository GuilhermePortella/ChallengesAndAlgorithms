package br.guilherme.Algoritmos.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author Guilherme
 */
public class AppleandOrange {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int applesIn = 0;
        int orangesIn = 0;

        for (int i : apples) {
            if (a + i >= s && a + i <= t) {
                applesIn++;
            }
        }

        for (int i : oranges) {
            if (b + i <= t && b + i >= s) {
                orangesIn++;
            }
        }

        System.out.println(applesIn + "\n" + orangesIn);

    }

    public static void countApplesAndOranges2(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int numApples = 0;
        int numOranges = 0;

        List<Integer> appleList = new ArrayList<Integer>();
        List<Integer> orangeList = new ArrayList<Integer>();

        for (int i = 0; i < apples.size(); i++) {
            appleList.add(apples.get(i) + a);
        }
        for (int j = 0; j < oranges.size(); j++) {
            orangeList.add(oranges.get(j) + b);
        }
        for (int i = 0; i < appleList.size(); i++) {
            if (appleList.get(i) >= s && appleList.get(i) <= t) {
                numApples++;
            }
        }
        for (int i = 0; i < orangeList.size(); i++) {
            if (orangeList.get(i) >= s && orangeList.get(i) <= t) {
                numOranges++;
            }
        }

        System.out.println(numApples);
        System.out.println(numOranges);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }

}
