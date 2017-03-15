/**
 * Created by Владимир on 14.03.2017.
 */

import java.util.Scanner;
public class Block1_HW5 {
    public static void main(String[] args) {
        System.out.println("Данная программа высчитывает вес человека на Венере");
        Scanner b = new Scanner(System.in);
        System.out.println("Введите вес человека");
        double a = b.nextFloat();
        double x = (a*0.9);
        System.out.println (String.format("Вес человека на венере равен %(.1f", x));

    }

}
