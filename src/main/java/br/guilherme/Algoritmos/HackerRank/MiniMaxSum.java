package br.guilherme.Algoritmos.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author Guilherme
 */
public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        
        long minSum = arr.get(0);
        long maxSum = minSum;
        long sum = 0;
           
        for(int i = 0; i<arr.size(); i++) {
            
            sum += arr.get(i);
            if(minSum > arr.get(i))
                minSum = arr.get(i);
                
            if(arr.get(i) > maxSum)
                maxSum = arr.get(i);  
        }
        
        System.out.println((sum-maxSum) + " " + (sum-minSum));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }

}
