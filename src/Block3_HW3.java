import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Владимир on 22.03.2017.
 */
public class Block3_HW3 {
    public static void main(String[] args) {
        int massive[] = {1, 2, 3};
        int i;
        for (int v : massive)
            System.out.print(v);
        for(i = massive.length - 1; i >= 0; i--) {
            System.out.print(massive[i]);
        }
    }
}

