import java.util.Scanner;

/**
 *
 * В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую

 и выводящую на экран сумму цифр числа n (n – вводит пользователь).
 * Created by 1 on 02.06.2016.
 */
public class Sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if((num<100)&&(num>=10)){
            int sum = (num/10)+num%10;
            System.out.println(sum);}
        else{
            System.out.println("Введите другое число");
        }
    }
}
