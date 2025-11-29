package lambdaexpression.calculator;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        double number1=scanner.nextDouble();
        double number2 = scanner.nextDouble();

        Calculator calculator=new Calculator();

        calculator.calculate(number1, number2, new Operations() {
            @Override
            public void performOperation(double x, double y) {
                System.out.println("Addition is "+ (x + y));
            }
        });

        calculator.calculate(number1, number2, (x, y) -> System.out.println("checkk"+ x + y));

    }
}
