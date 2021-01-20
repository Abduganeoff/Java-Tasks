import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 natural numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 == num2 || num1 == num3 || num2 == num3){
            System.out.println("OK");
        }else {
            System.out.println("NOT OK");
        }
    }
}
