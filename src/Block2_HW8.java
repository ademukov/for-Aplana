import java.util.Scanner;

/**
 * Created by Владимир on 18.03.2017.
 */
public class Block2_HW8 {
    public static void main(String[] args){
        int a;
        long b=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Введите натуральное число");
        if(s.hasNextInt()){
            a=s.nextInt();
            for(int i=a;i>0;i--){
                b*=i;
            }
            System.out.println("Факториал числа "+a+" равен "+b);
        }
        else System.out.println("Ошибка. Введите число");

    }
}
