import java.util.Scanner;

/**
 * В переменных a и b лежат положительные длины катетов прямоугольного треугольника.

 Вычислить и вывести на экран площадь треугольника и его периметр (a и b – вводит

 пользователь).
 *
 * Created by 1 on 02.06.2016.
 */
public class Triangle {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double s  =0.5*a*b;
        double c = Math.sqrt(a*a+b*b);
        double p= a+b+c;
        if (a>0&&b>0){
            System.out.println(s);
            System.out.println(p);
        }

    }
}
