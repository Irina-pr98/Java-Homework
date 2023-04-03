// *дополнительно. К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4
// 4 + 3 = 7
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class third_task2 {

    public static void logging(String str) {
        String path = "calc.txt";
        File logFile = new File(path);
        try {
            FileWriter writer = new FileWriter(logFile, true);
            writer.write(str + "\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Что то пошло не так");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.print("Введите знак: ");
        String sym = sc.next();
        System.out.print("Введите второе число: ");
        int num2 = sc.nextInt();
        String str = "";
        if (sym.equals("+")) {
            str += num1 + " + " + num2 + " = " + (num1 + num2);
        } else if (sym.equals("-")) {
            str += num1 + " - " + num2 + " = " + (num1 - num2);
        } else if (sym.equals("*")) {
            str += num1 + " * " + num2 + " = " + (num1 * num2);
        } else if (sym.equals("/")) {
            double num_1 = num1;
            double num_2 = num2;
            str += num_1 + " / " + num_2 + " = " + (num_1 / num_2);
        } else {
            System.out.println("Ошибка ввода");
        }
        logging(str);
        System.out.println(str);
        sc.close();
    }
}

