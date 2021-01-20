import java.util.Arrays;

public class Task05 {
    public static void main(String[] args) {
        final int SIZE = 10;
        final int NUMS = 13;
        int[] arr = new int[SIZE];
        int counter = 0;

        // your code here
        int fillArray = 0;
        while (fillArray < SIZE && SIZE <= NUMS) {
            counter++;

            // Here I have range [1, NUMS] where both are inclusive,
            // if NUMS is exclusive please do not consider (NUMS + 1). Thank you.
           int key = (int) ((Math.random() * ((NUMS + 1 ) - 1)) + 1);

            if(hasExist(arr, key)){
                continue;
            } else {
                arr[fillArray] = key;
                fillArray++;
            }

        }

        System.out.println("With SIZE = " + SIZE + " and " +
                "NUMS=" + NUMS + " the array\nhas been " +
                "filled after " + counter + " trials");
        System.out.println("Array: " + Arrays.toString(arr));
    }

    public static boolean hasExist(int[] numbers, int toCheckValue){
        boolean test = false;
        for (int element : numbers) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }
        return test;
    }
}
