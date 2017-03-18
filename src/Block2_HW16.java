/**
 * Created by Владимир on 18.03.2017.
 */
public class Block2_HW16 {
    public static void main(String[] args){
        int a=0;
        for(int b=4;b<=99994;b++){
            String c=String.valueOf(b);
            if(c.indexOf('4')!=-1){
                a++;
            }
            else if(c.indexOf('1')!=-1&c.indexOf('1')+1==c.indexOf('3')){
                a++;
            }
        }
        System.out.println("Всего нужно исключить номеров: "+a);
    }
}
