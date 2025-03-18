import java.util.Scanner;

public class SafeInput {

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int userInt = 0;
        boolean validInput = false;

        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                userInt = pipe.nextInt();
                if (userInt >= low && userInt <= high) {
                    validInput = true; // Input is within range
                } else {
                    System.out.println("Error: Input must be between " + low + " and " + high + ".");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter an integer.");
                pipe.next(); // Discard invalid input
            }
        } while (!validInput);

        return userInt;
    }
}