import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        // Считывание 5 целых чисел (x, a, b, c, d) с консоли
        int x = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if (x < a)
            // Если x < a, то выводим 0
            // Иначе сравниваем x и a+b
            out.println(0);
        else{
            // Если x < a+b, то выводим 1
            // Иначе сравниваем x и a+b+c
            if (x < a+b)
                out.println(1);
            else{
                // Если x < a+b+c, то выводим 2
                // Иначе сравниваем x и a+b+c+d
                if (x < a+b+c)
                    out.println(2);
                else{
                    // Если x < a+b+c+d, то выводим 2
                    // Иначе выводим 4
                    if (x < a+b+c+d)
                        out.println(3);
                    else
                        out.println(4);
                }
            }
        }
    }
}