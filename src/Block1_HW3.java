import java.util.Scanner;

/**
 * Created by Владимир on 14.03.2017.
 */
public class Block1_HW3 {
    public static void main(String[] args) {

        System.out.println("Данная программа округляет число с дробной частью до целого числа");
        System.out.println("Введите число");
        Scanner a = new Scanner(System.in);
        float n = a.nextFloat();
        int x = Math.round(n);
        System.out.println("Результат округления числа "+n+" Равен "+ x);
    }
}


