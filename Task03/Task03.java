
import java.util.Scanner;
public class Task03 {

        public static void main(String[] args) {
            //first interval
            int a1 = 2, a2 = 4;
            //second interval
            int b1 = 1, b2 = 6;

            System.out.println("Interval A = [" + a1 +", "+a2+"]");
            System.out.println("Interval B = [" + b1 +", "+b2+"]");

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter x ");
            int x = scan.nextInt();
            scan.close();

            System.out.println("x in A: " + (x >= a1 && x <= a2));
            System.out.println("x in B: " + (x >= b1 && x <= b2));
            System.out.println("x in A not in B: " + ((x >= a1 && x <= a2) && (!(x >= b1 && x <= b2))));
            System.out.println("x in B not in A: " + ((x >= b1 && x <= b2) && (!(x >= a1 && x <= a2))));
            System.out.println("x in intersection of A and B: " + ((x >= a1 && x <= a2) && (x >= b1 && x <= b2)));
            System.out.println("x in union of A and B: " + ((x >= a1 && x <= a2) || (x >= b1 && x <= b2)));
            System.out.println("x in symm. diff. of A and B: " + ((x >= a1 && x <= a2) ^ (x >= b1 && x <= b2)));

        }
}
