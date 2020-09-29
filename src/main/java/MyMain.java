import java.util.Arrays;
public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int len = arr.length;
        int len2 = len -1;
        int x [] = new int [len];
        for (int i = 0; i < len; i ++) {
            x[i] = arr[len2 - i];
                
            }
            return x;
        }
    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int len = arr.length;
        int num = arr[0];
        int x [] = new int [len-1];
        for (int i = 1; i < len; i ++) {
            num = Math.max(num, arr[i]);
        }
        for (int i = 0; i < len; i ++ ) {
            if (arr[i] != num) {
                x[i] = arr[i-1];
            }
        }
        int num2 = x[0];
        for (int i = 1; i < x.length; i++) {
            num2 = Math.max(num2, x[i]);
        }
        return num2;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        double [] x = new double [arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
           double ratio = (double) arr[i+1]/arr[i];
           x[i] = ratio;
        }
        double num = x[0];
        int c = 0;
        System.out.println(Arrays.toString(x));
        for (int i = 0; i < arr.length-1; i++) {
            if (num == x[i]) {
                c = c + 1;
            }
        }
        if (c == x.length) {
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        int z [] = {1, 2, 4, 8, 16, 33};
        System.out.println((isGeometric(z)));
    }
}
