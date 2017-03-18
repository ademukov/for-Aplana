/**
 * Created by Владимир on 18.03.2017.
 */
public class Block2_HW11 {
    public static void main(String[] args){
        int a=1,b=1,c=0;
        System.out.print(a+" "+b+" ");
        for(int d=3;d<=11;d++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
