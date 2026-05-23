import java.util.Scanner;

public class EnhancedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== ENHANCED CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Celsius to Fahrenheit");
            System.out.println("8. Fahrenheit to Celsius");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            double num1, num2, result;
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    if (num1 >= 0) {
                        result = Math.sqrt(num1);
                        System.out.println("Square Root = " + result);
                    } else {
                        System.out.println("Invalid input!");
                    }
                    break;
                case 6:
                    System.out.print("Enter base number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter power: ");
                    num2 = sc.nextDouble();
                    result = Math.pow(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                case 7:
                    System.out.print("Enter temperature in Celsius: ");
                    num1 = sc.nextDouble();
                    result = (num1 * 9 / 5) + 32;
                    System.out.println("Temperature in Fahrenheit = " + result);
                    break;
                case 8:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    num1 = sc.nextDouble();
                    result = (num1 - 32) * 5 / 9;
                    System.out.println("Temperature in Celsius = " + result);
                    break;
                case 9:
                    System.out.println("Exiting Calculator...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 9);
    }
}