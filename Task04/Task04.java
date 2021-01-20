import javax.swing.*;

public class Task04 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null,"Enter a natural number");
        int x = Integer.parseInt(s);

        if(x < 2) {
            JOptionPane.showMessageDialog(null,
                     "Invalid input!!!");
            System.exit(0);
        }

        if(isPrime(x)) {
            JOptionPane.showMessageDialog(null,
                    x + " is a prime number");
            System.exit(0);
        } else {
            nonTrivalDivisors(x);
        }
    }

    public static boolean isPrime (int num){
        boolean flag = true;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    static void nonTrivalDivisors(int n) {
        String divisors = "";
        for (int i=2; i < n; i++){
            if (n%i == 0){
                divisors += i + " ";
            }
        }
        JOptionPane.showMessageDialog(null,
                "Nontrival divisors of "+ n + ": " + divisors);
        System.exit(0);
    }

}
