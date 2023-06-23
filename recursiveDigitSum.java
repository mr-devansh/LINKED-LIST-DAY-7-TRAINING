import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static int superDigit(String n, int k) {
        // Calculate the initial sum
        long sum = 0;
        for (char c : n.toCharArray()) {
            sum += c - '0';
        }
        sum *= k; // Multiply the sum by k
        
        // Calculate the super digit recursively
        return calculateSuperDigit(sum);
    }
    
    private static int calculateSuperDigit(long num) {
        // Base case: if num is a single digit, return it
        if (num >= 0 && num <= 9) {
            return (int) num;
        }
        
        // Calculate the sum of digits
        long sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        
        // Recursively calculate the super digit
        return calculateSuperDigit(sum);
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
