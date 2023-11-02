import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            
            if (choice == 5) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please enter a valid option (1-5).");
                continue;
            }
            
            System.out.print("Enter the first number: ");
            double num1 = input.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = input.nextDouble();
            
            double result = 0;
            
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Division by zero is not allowed.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            
            System.out.println("Result: " + result);
        }
        
        input.close();
    }
}