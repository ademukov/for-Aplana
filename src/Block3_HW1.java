import java.util.Random;

/**
 * Created by Владимир on 21.03.2017.
 */
public class Block3_HW1 {
    public static void main(String[] args) {
        int[][] massive = new int[8][5];{
            for(int a=0;a<massive.length;a++){
                for(int b=0;b<massive[a].length;b++){
                    massive[a][b]= new Random().nextInt(90)+10;
                    System.out.print(massive[a][b]+" ");
                }
                System.out.println();
            }
        }
    }
}