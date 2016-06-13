import java.util.Scanner;

/**
 *
 * Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в

 переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45 (n и m –

 вводит пользователь).
 * Created by 1 on 02.06.2016.
 */
public class Near10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double n = scanner.nextDouble();
        double m1= 10-m;
        double n1 = 10-n;
        if (Math.abs(n1) < Math.abs(m1)) {
            System.out.println(n);
        } else {
            System.out.println(m);

        }
    }
}