import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num1;
        int num2;
        char operator;
        float result;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the operator (+, -, *, /): ");
        operator = scanner.next().charAt(0); // Read only the first character

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        result = 0; // Initialize result to avoid errors

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/' && num2 != 0) {
            result = (float) num1 / num2; // Cast to float for decimal result
        } else {
            System.out.println("Invalid operator or division by zero!");
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
