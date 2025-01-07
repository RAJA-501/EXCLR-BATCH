import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        
        System.out.println("\nSwapping using a temporary variable:");
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        
        System.out.println("\nSwapping using arithmetic operations:");
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 + num2; 
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

       
        System.out.print("\nEnter the first number again: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number again: ");
        num2 = scanner.nextInt();

        
        System.out.println("\nSwapping using bitwise XOR:");
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 ^ num2; 
        num2 = num1 ^ num2; 
        num1 = num1 ^ num2; 
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        
        scanner.close();
    }
}