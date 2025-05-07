import java.util.Scanner;
public class Cadmus0A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        double number1 = scanner.nextDouble();

        System.out.println("Enter Operation: +, _, *, /");
        char operation = scanner.next().charAt(0);

        System.out.println("Enter 2nd number: ");
        double number2 = scanner.nextDouble();

        double result;

        //Switch operations.
        switch (operation) {
            case '+':
                result = number1 + number2;
                System.out.println("result" + result);
                break;
            case'-':
                result = number1 - number2;
                System.out.println("result" + result);
                break;
            case'*' :
                result = number1 * number2;
                System.out.println("result" + result);
                break;
            case'/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                } else System.out.println("error");
                break;
            default:
        }
    }
}
