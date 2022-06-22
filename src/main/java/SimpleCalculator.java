import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число \n");
        int numberFirst = scanner.nextInt();
        System.out.print("Введите второе число \n" );
        int numberSecond = scanner.nextInt();

        Calculator calculator = new Calculator(numberFirst, numberSecond);
        System.out.println( " S = " + calculator.add(numberFirst, numberSecond));
        System.out.println( " M = " + calculator.multiply(numberFirst, numberSecond));

    }
}