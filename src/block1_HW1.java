import java.util.Scanner;

/**
 * Created by Владимир on 12.03.2017.
 */
public class block1_HW1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Данная программа делит 2 числа и показывает остаток");
        System.out.println("Введите первое число");
        int q = a.nextInt();
        System.out.println("Введите второе число");
        int w = a.nextInt();
        System.out.println("Результат деления = "+(q/w));
        System.out.println("Остаток = "+(q%w));
    }
}
