import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter operation ([+][-][*][/]): ");
        String operation = scanner.nextLine();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = 0;
        System.out.println("_____________________");

        if (operation.equals("+")) {
            result = num1 + num2;
            System.out.println("Result: " + result);
        }
        else if (operation.equals("-")) {
            result = num1 - num2;
            System.out.println("Result: " + result);
        }
        else if (operation.equals("*")) {
            result = num1 * num2;
            System.out.println("Result: " + result);
        }
        else if (operation.equals("/")) {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            }
            else {
                System.out.println("Error: Cannot divide by zero!");
            }
        }
        else {
            System.out.println("Unknown operation. Use: [+][-][*][/]");
        }
        System.out.println("_____________________");
        scanner.close();
    }
}

