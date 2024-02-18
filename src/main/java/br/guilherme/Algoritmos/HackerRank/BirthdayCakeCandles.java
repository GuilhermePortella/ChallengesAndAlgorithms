package br.guilherme.Algoritmos.HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author Guilherme
 */
public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        
        int resposta = 0;
        int maxValor = 1;
        
        for (int i = 0; i < candles.size(); i++) {
            maxValor = Math.max(maxValor, candles.get(i));
        }
        
        for (int i = 0; i < candles.size(); i++) {
            if (maxValor == candles.get(i)) {
                resposta ++;
            }
        }
        
        return resposta;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
