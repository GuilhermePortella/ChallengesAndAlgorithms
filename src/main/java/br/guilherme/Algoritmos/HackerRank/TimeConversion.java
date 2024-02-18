package br.guilherme.Algoritmos.HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Guilherme
 */
public class TimeConversion {

    public static String timeConversion(String s) {

        String formaa = s;
       DateTimeFormatter displayFormatter = DateTimeFormatter.ofPattern(formaa);
        DateTimeFormatter parseFormatter = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time = LocalTime.parse("10:30 PM", parseFormatter);
        

        return parseFormatter.format(time);

    }
    
    

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
