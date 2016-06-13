import java.util.Scanner;

/**
 * Создать программу, проверяющую и сообщающую на экран, является ли целое число,

 записанное в переменную n, чётным либо нечётным (n – вводит пользователь).
 *
 * Created by 1 on 02.06.2016.
 */
public class EvenNumber {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%2==0){
            System.out.println(n + " четное число");

        }
        else{
            System.out.println(n + " нечетное число");
        }

    }
}
