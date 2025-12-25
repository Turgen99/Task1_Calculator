import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        CalculatorFunctions calculator = new CalculatorFunctions();

        System.out.println("\n\n->Java Calculator: ");

        while (true){

            System.out.println("\nChose your calculation operation: ");
            System.out.println("\n1 - Addition (+)");
            System.out.println("2 - Subtraction (-)");
            System.out.println("3 - multiplication (*)");
            System.out.println("4 - Division (/)");
            System.out.println("5 - Square Root (√)");
            System.out.println("6 - exponentiation (^)");
            System.out.println("0 - EXIT");
            System.out.println("\nChoose: ");

            int choose = scanner.nextInt();

            // Exit
            if (choose == 0){
                System.out.println("\nExiting...");
                break;
            }

            // Square Root(Kare Kök)
            if (choose == 5){
                System.out.println("\nEnter Number: ");
                double num = scanner.nextDouble();
                System.out.println("\nAnswer: "+ calculator.sqrt(num));
            }
            // Others
            else if (choose >= 1 && choose <= 6) {
                // Defining "a"
                System.out.println("\nEnter first number: ");
                double num1 = scanner.nextDouble();

                // Defining "b"
                System.out.println("Enter second number: ");
                double num2 = scanner.nextDouble();

                // Choosing Other calculation methods.
                switch (choose){
                    case 1: // Addition
                        System.out.println("\nAnswer" + calculator.add(num1, num2));
                        break;
                    case 2: // Subtraction
                        System.out.println("\nAnswer: " + calculator.subtract(num1, num2));
                        break;
                    case 3: // Multiplication
                        System.out.println("\nAnswer: " + calculator.multiply(num1, num2));
                        break;
                    case 4: // Division
                        System.out.println("\nAnswer: " + calculator.divide(num1, num2));
                        break;
                    case 6:// Exponentiation
                        System.out.println("\nAnswer: " + calculator.power(num1, num2));
                        break;
                }
            }
            // Choose not in range
            else {
                System.out.println("Error: Invalid Value!");
            }


        }
    }
}