import java.util.Random;

/**
 * Created by Владимир on 21.03.2017.
 */
public class Block3_HW1 {
    int[][] massive = new int[8][5];{
        for(int a=0;a<massive.length;a++){
            for(int b=0;b<massive[a].length;b++){
                massive[a][b]=(int)(Math.random()*90)+10;
                System.out.println(massive[a][b]+" ");
            }
        }
    }
}
