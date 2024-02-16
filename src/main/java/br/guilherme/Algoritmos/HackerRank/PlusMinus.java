/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.guilherme.Algoritmos.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Guilherme
 */
public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {

        float positive = 0;
        float negative = 0;
        float zeros = 0;

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i) > 0) {
                positive++;
            } else if (arr.get(i) < 0) {
                negative++;
            } else if (arr.get(i) == 0) {
                zeros++;
            }

        }

        System.out.printf("%.5f%n", positive / arr.size());
        System.out.printf("%.5f%n", negative / arr.size());
        System.out.printf("%.5f%n", zeros / arr.size());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        plusMinus(arr);

        bufferedReader.close();
    }

}
