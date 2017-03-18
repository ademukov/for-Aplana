/**
 * Created by Владимир on 18.03.2017.
 */
public class Block2_HW15 {
    public static void main(String[] args){
        int a=0;
        for(int h=1;h<=24;h++){
            for(int m=0;m<=59;m++){
                //Сравниваем значения чисел и в случае совпадения увеличиваем счетчик
                if(h/10%10==m%10&h%10==m/10%10){
                    a++;
                }
            }
        }
        System.out.println("Всего "+a+" совпадений");
    }
}
