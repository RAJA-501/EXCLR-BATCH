import java.util.Scanner;

public class Demo014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

      
        int incremented = ++number; 
        int decremented = --number;  
    
        System.out.println("Original number: " + number);
        System.out.println("After incrementing: " + incremented);
        System.out.println("After decrementing: " + decremented);
        

        
        scanner.close();
    }
}