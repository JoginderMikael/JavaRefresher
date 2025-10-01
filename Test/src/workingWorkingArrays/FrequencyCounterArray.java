package workingWorkingArrays;

import java.util.Scanner;

public class FrequencyCounterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find maximum element (to size frequency array correctly)
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Frequency array
        int[] freq = new int[max + 1];

        // Count frequencies
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        // Print results
        System.out.println("Frequencies:");
        for (int i = 0; i <= max; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}

