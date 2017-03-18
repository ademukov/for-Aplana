import java.util.Random;
import java.util.Scanner;

/**
 * Created by Владимир on 17.03.2017.
 */
public class Block2_HW2 {
    public static void main(String[] args){
        Random r=new Random();
        int a= (int)r.nextInt(899)+100;
        int b=a%10;
        int c=(a/10)%10;
        int d=(a/100)%10;
        if(b>=c&b>d||b>c&b>=d){
            System.out.println("В числе "+a+" наибольшая цифра " +b);
        }
        else {
            if (c>b&c>=d) {
                System.out.println("В числе "+a+" наибольшая цифра " +c);
            }
            else {
                System.out.println("В числе "+a+" наибольшая цифра " +d);
            }
        }
    }
}
