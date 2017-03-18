import java.util.Scanner;

/**
 * Created by Владимир on 18.03.2017.
 */
public class Block2_HW9 {
    public static void main(String[] args){
        int a;
        Scanner scn=new Scanner(System.in);
        System.out.println("Введите натуральное число");
        if(scn.hasNextInt()){
            a=scn.nextInt();
            for(int i=a;i>0;i--){
                int b=a%i;
                if(b==0)
                    System.out.print(i+" ");
            }
        }
        else System.out.println("Ошибка. Введите число");

    }
}
