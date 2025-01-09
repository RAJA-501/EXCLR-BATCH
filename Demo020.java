
import java.util.Scanner;
public class TaxOnIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter monthly gross salary: ");
        double monthlyGrossSalary = scanner.nextDouble();
        System.out.print("Enter HRA: ");
        double hra = scanner.nextDouble();
        System.out.print("Enter PF: ");
        double pf = scanner.nextDouble();
        double annualSalary = monthlyGrossSalary * 12;
        double deductions = hra + pf;
        double taxableIncome = annualSalary - deductions;
        double tax = 0;
        if (taxableIncome <= 500000) {
            tax = taxableIncome * 0.10; 
        } else if (taxableIncome <= 1000000) {
            tax = (500000 * 0.10) + ((taxableIncome - 500000) * 0.20);
        } else {
            tax = (500000 * 0.10) + (500000 * 0.20) + ((taxableIncome - 1000000) * 0.30);
        }

        System.out.printf("Annual Salary: %.2f%n", annualSalary);
        System.out.printf("Deductions: %.2f%n", deductions);
        System.out.printf("Taxable Income: %.2f%n", taxableIncome);
        System.out.printf("Total Annual Tax: %.2f%n", tax);

        scanner.close();
    }
}