// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

import java.util.Scanner;

public class third_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNumber = sc.nextInt();
        System.out.print("Введите знак: ");
        String symbol = sc.next();
        System.out.print("Введите второе число: ");
        int secondNumber = sc.nextInt();

        if (symbol.equals("+")) {
            System.out.printf("%d + %d = %d", firstNumber, secondNumber, firstNumber + secondNumber);
        } else if (symbol.equals("-")) {
            System.out.printf("%d - %d = %d", firstNumber, secondNumber, firstNumber - secondNumber);
        } else if (symbol.equals("*")) {
            System.out.printf("%d * %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
        } else if (symbol.equals("/")) {
            double number1 = firstNumber;
            double number2 = secondNumber;
            System.out.printf("%d / %d = %f", firstNumber, secondNumber, number1 / number2);
        } else {
            System.out.println("Ошибка");
        }
        sc.close();
    }
}
