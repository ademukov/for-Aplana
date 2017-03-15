import java.util.Scanner;

/**
 * Created by Владимир on 13.03.2017.
 */
public class Block1_HW2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Данная программа считает сумму всех чисел двухзначного числа");
        System.out.println("Введите натуральное двузначное число");
        int n = a.nextInt();
        int b = n%10;
        int c = (n/10)%10;
        System.out.println("Сумма двух чисел равна " + (b+c));
    }
}
