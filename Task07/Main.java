import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
         int[][][] opers = {
                { {100, -50, 25}, {150,-300}, {300,-90,100} },
                { {90, -60, 250}, {300,20,-100} },
                { {20, 50}, {300}, {20,-20,40}, {100,-200} }
          };


         int[] customers = new int[opers.length];
         
         for(int i = 0; i < opers.length; i++) {
             for(int j = 0; j < opers[i].length; j++) {
                 for(int x = 0; x < opers[i][j].length; x++) {
                     customers[i] += opers[i][j][x];
                 }
             }
         }

        System.out.println(Arrays.toString(customers));

    }
}
