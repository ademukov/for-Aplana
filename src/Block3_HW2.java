import java.util.Random;

/**
 * Created by Владимир on 21.03.2017.
 */
public class Block3_HW2 {
    public static void main(String[] args) {
        int[][] massive = new int[5][8];{
            for(int a=0;a<massive.length;a++){
                for(int b=0;b<massive[a].length;b++){
                    massive[a][b]= (int)((Math.random()*199)-99);
                    System.out.print(massive[a][b]+" ");
                }
                System.out.println();
            }
        }
        int min = massive[0][0];
        for (int a=0;a<massive.length;a++){
            for (int b=0;b<massive[a].length;b++){
                if (massive[a][b]>min)min=massive[a][b];
            }
        }
        System.out.println(" ");
        System.out.println("Значение максимального элемента массива = "+min);
    }
}
