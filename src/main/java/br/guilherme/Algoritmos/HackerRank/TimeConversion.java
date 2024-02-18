package br.guilherme.Algoritmos.HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Guilherme
 */
public class TimeConversion {

    public static String timeConversion(String s) {

        
        DateFormat hours12Format = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat hours24Format = new SimpleDateFormat("HH:mm:ss");
        String result = null;
        
        try{
            Date parsed12HoursDate = hours12Format.parse(s);
            result = hours24Format.format(parsed12HoursDate);
        }catch(ParseException e) {
            
        }
        
        return result;
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
