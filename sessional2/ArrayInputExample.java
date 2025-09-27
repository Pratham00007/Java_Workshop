import java.util.InputMismatchException;
import java.util.Scanner;

// Custom Exception
class NegativeNumberNotAllowedException extends Exception {
    public NegativeNumberNotAllowedException(String message) {
        super(message);
    }
}

public class ArrayInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = 0;

        try {
            size = sc.nextInt();
            if (size <= 0) {
                System.out.println("Array size must be positive!");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer for array size.");
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter " + size + " integer values:");

        for (int i = 0; i < size; i++) {
            try {
                int value = sc.nextInt();

                // Check for negative number
                if (value < 0) {
                    throw new NegativeNumberNotAllowedException("Negative numbers are not allowed: " + value);
                }

                arr[i] = value; // Store in array
                System.out.println("Stored: " + value);

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter integers only.");
                sc.next(); // clear invalid input
                i--; // retry current index
            } catch (NegativeNumberNotAllowedException e) {
                System.out.println(e.getMessage());
                i--; // retry current index
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Tried to access array out of bounds!");
            }
        }

        // Print all stored values
        System.out.println("\nFinal Array Elements:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}