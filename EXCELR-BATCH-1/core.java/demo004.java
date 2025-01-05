import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String correctUser Id = "user123";
        String correctPassword = "pass@123";
        
        String userId;
        String password;
        
        
        while (true) {
            System.out.print("Enter User ID: ");
            userId = scanner.nextLine();
            
            System.out.print("Enter Password: ");
            password = scanner.nextLine();
            
            
            if (userId.equals(correctUser Id) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                break; 
            } else {
                System.out.println("Invalid User ID or Password. Please try again.");
            }
        }
        
        scanner.close();
    }
}