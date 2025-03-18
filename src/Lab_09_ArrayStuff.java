import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] dataPoints = new int[100];
        Random rand = new Random();

        // Fill the array with random values between 1-100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        // Display the array contents
        System.out.println("Array Contents:");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(); // Newline

        // Task 5: Prompt user for a value (1-100) using SafeInput
        int userValue = SafeInput.getRangedInt(in, "Enter a number between 1 and 100: ", 1, 100);

        // Task 6: Count occurrences of userValue in dataPoints
        int count = 0;
        for (int num : dataPoints) {
            if (num == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " was found " + count + " times in the array.");

        // Task 7: Find the first occurrence of userValue
        int searchValue = SafeInput.getRangedInt(in, "Enter another number to search for: ", 1, 100);
        int position = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchValue) {
                position = i;
                break; // Exit loop once the first match is found
            }
        }

        if (position != -1) {
            System.out.println("The value " + searchValue + " was found at array index " + position + ".");
        } else {
            System.out.println("The value " + searchValue + " was not found in the array.");
        }

        // Task 8: Find the minimum and maximum values in dataPoints
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int num : dataPoints) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);

        // Task 9: Call getAverage method and display the result
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    // Task 9: Method to calculate the average of an array
    public static double getAverage(int[] values) {
        int sum = 0;
        for (int num : values) {
            sum += num;
        }
        return (double) sum / values.length;
    }
}
