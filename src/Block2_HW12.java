import java.util.Scanner;

/**
 * Created by Владимир on 18.03.2017.
 */
public class Block2_HW12 {
    public static void main(String[] args){
        System.out.println("Введите число");
        int a,b=0;
        Scanner scn=new Scanner(System.in);
        if(scn.hasNextInt()){
            a=scn.nextInt();
            while(a!=0){
                b=b+a%10;
                a/=10;
            }

            System.out.println("Сумма всех чисел введенного числа равна "+b);
        }
        else System.out.println("Ошибка. Введите число");
    }
}
