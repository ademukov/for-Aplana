/**
 * Created by Владимир on 18.03.2017.
 */
public class Block2_HW14 {
    public static void main(String[] args){
        int a=0;
        for(int b=2;b<=50000;b++){
            String c=String.valueOf(b);
            if(c.indexOf('2')!=-1){
                a++;
            }
        }
        System.out.println("Всего бракованных табличек - "+a);
    }
}
