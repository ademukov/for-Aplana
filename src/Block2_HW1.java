import java.util.Scanner;

/**
 * Created by Владимир on 16.03.2017.
 */
public class Block2_HW1 {
    public static void main(String[] args){
        int a= (int)(Math.random()*150+1)+5;
        if(a<=25||a>=100){
            System.out.println("Число "+a+" не содержится в интервале (25,100)");
        }
        else {
            System.out.println("Число "+a+" содержится в интервале (25,100)");
        }
    }
    }

//https://git-scm.com/docs/gitignore
//посмотри тут меню удобное есть Refactor, через него лучше всего удалять и переименовывать