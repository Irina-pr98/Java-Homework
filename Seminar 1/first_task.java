// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

import java.util.Scanner;
public class first_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();

        // Вычисление суммы чисел от 1 до n
        int sumNumber = number * (number + 1) / 2;
        System.out.printf("Сумма чисел от 1 до %d =  %d%n", number, sumNumber);
        
        // Вычисление факториала
        int factorial = 1;
        for(int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.printf("%d! = %d%n", number, factorial);
        sc.close();
    }
    
}