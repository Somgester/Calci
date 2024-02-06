import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scientific Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Exponentiation");
        System.out.println("Enter your choice (1-6): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Addition();
                break;
            case 2:
                Subtraction();
                break;
            case 3:
                Multiplication();
                break;
            case 4:
                Division();
                break;
            case 5:
                SquareRoot();
                break;
            case 6:
                Exponentiation();
                break;
            default:
                System.out.println("Choose btwn 1 to 6.");
        }

        scanner.close();
    }

    private static void Addition() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double number;

        System.out.println("Enter numbers to add (enter 0 to finish): ");
        do {
            number = scanner.nextDouble();
            sum += number;
        } while (number != 0);

        System.out.println("Result: " + sum);
    }

    private static void Subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minuend: ");
        double m = scanner.nextDouble();
        System.out.println("Enter the subtrahend: ");
        double sb = scanner.nextDouble();
        double result = m - sb;
        System.out.println("Result: " + result);
    }

    private static void Multiplication() {
        Scanner scanner = new Scanner(System.in);
        double pr = 1;
        double n;

        System.out.println("Enter numbers to multiply (enter 0 to finish): ");
        do {
            number = scanner.nextDouble();
            if (n != 0) {
                pr *= n;
            }
        } while (n != 0);

        System.out.println("Result: " + pr);
    }

    private static void Division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numerator: ");
        double nm = scanner.nextDouble();
        double d;
        double result = nm;

        System.out.println("Enter denominators to divide (enter 0 to finish): ");
        do {
            d = scanner.nextDouble();
            if (d != 0) {
                result /= d;
            }
        } while (d != 0);

        System.out.println("Result: " + result);
    }

    private static void SquareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = scanner.nextDouble();
        if (num >= 0) {
            double result = Math.sqrt(num);
            System.out.println("Square Root: " + result);
        } else {
            System.out.println("Error");
        }
    }

    private static void Exponentiation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base: ");
        double b = scanner.nextDouble();
        System.out.println("Enter exponent: ");
        double exp = scanner.nextDouble();
        double result = Math.pow(b, exp);
        System.out.println("Result: " + result);
    }
}
