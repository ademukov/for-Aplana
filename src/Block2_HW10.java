import java.util.Scanner;

/**
 * Created by Владимир on 18.03.2017.
 */
public class Block2_HW10 {
    public static void main(String[] args){
        int a;
        Scanner scn=new Scanner(System.in);
        System.out.println("Введите натуральное число");
        if(scn.hasNextInt()){
            a=scn.nextInt();
            for(int i=(int)Math.sqrt(a);i>=1;i--){
                if(a%i==0&i!=1){
                    System.out.println("Заданное число - составное");
                    break;
                }
                if(i==1) System.out.println("Заданное число простое");
            }
        }
        else System.out.println("Ошибка. Введите число");

    }
}
