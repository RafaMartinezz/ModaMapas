import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Main class that calculates the frequency of each integer input by the user
 * and identifies the most frequently occurring integer. The program reads an
 * integer followed by a sequence of numbers, outputs each number's frequency,
 * and finally prints the number with the highest frequency.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros; // Number of integers in the current sequence

        // Read sequences of numbers until the input "0" is encountered
        while ((numeros = sc.nextInt()) != 0) {
            // Map to store each number and its frequency
            Map<Integer, Integer> m = new HashMap<>();

            // Populate the map with the frequency of each number
            for (int i = 0; i < numeros; i++) {
                int numero = sc.nextInt();
                Integer freq = m.get(numero);
                m.put(numero, (freq == null) ? 1 : freq + 1); // Increment frequency count
            }

            int maxFreq = 0; // Stores the highest frequency encountered
            int maxRep = 0; // Stores the number with the highest frequency

            // Determine the number with the highest frequency
            for (int i : m.keySet()) {
                if (m.get(i) > maxFreq) {
                    maxRep = i;
                    maxFreq = m.get(i);
                }
            }

            // Output the frequency of each number in the sequence
            for (int i : m.keySet()) {
                System.out.println(i + " " + m.get(i));
            }

            // Output the number with the highest frequency
            System.out.println(maxRep);
        }

        sc.close(); // Close the scanner
    }
}
