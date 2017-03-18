import java.util.Scanner;

/**
 * Created by Владимир on 16.03.2017.
 */
public class Block2_HW1 {
    public static void main(String[] args){
        System.out.println("Введите целое число от 5 до 155");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        if (b >=25 && b <=100){
        System.out.println("Число "+b+" содержится в интервале 25, 100");
        }
        else {
        System.out.println("Введите целое число от 5 до 155");
        }
    }
    }

//https://git-scm.com/docs/gitignore
//посмотри тут меню удобное есть Refactor, через него лучше всего удалять и переименовывать