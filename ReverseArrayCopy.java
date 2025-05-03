package Module2;
import java.util.Scanner;

public class ReverseArrayCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] original = new int[n];
        int[] reversed = new int[n];

       
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            original[i] = scanner.nextInt();
        }

     
        for (int i = 0; i < n; i++) {
            reversed[i] = original[n - 1 - i];
        }

        
        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(reversed[i] + " ");
        }

        scanner.close();
    }
}
