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
import java.util.stream.IntStream;

/**
 *
 * @author Guilherme
 */
public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        
        List<Integer> resposta = new ArrayList<Integer>();

        for (Integer grade : grades) {

            int multipleoffive = grade % 5;
            
            if (grade <= 37) {
                resposta.add(grade);
            } else {
                if (multipleoffive > 2) {
                    grade = grade + 5 - multipleoffive;
                }
                resposta.add(grade);
            }
        }
        return resposta;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = gradingStudents(grades);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

}
