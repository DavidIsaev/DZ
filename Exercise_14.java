import java.util.Scanner;
public class Exercise_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int initialValue = sc.nextInt();
        lenArray(length, initialValue);
        }
        public static void lenArray(int length, int initialValue) {

            int[] a = new int[length];
            for (int i = 0; i < length; i++) {
                a[i] = initialValue;
                System.out.print( a[i] + " ");
    }
}
}