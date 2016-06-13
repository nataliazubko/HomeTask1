import java.util.Scanner;

/**
 *
 * В три переменные a, b и c записаны три вещественных числа. Создать программу, которая

 будет находить и выводить на экран вещественные корни квадратного уравнения

 ax^2+bx+c=0, либо сообщать, что корней нет (a, b и c – вводит пользователь).
 * Created by 1 on 02.06.2016.
 */
public class Equation {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = Math.pow(b,2)-4*a*c;


        if (d>=0){
            double x1=((-b-Math.sqrt(d))/(2*a));
            double x2=((-b+Math.sqrt(d))/(2*a));
            System.out.println("Корень уравнения x1 =  "+ x1);
            System.out.println("Корень уравнения x2 =  "+ x2);}
            else{
                System.out.println("Нет вещественных корней");
            }

        }

    }

