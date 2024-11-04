import java.util.Arrays;

public class Exercise_10 {
public static void main(String[] args) {
    int[] a = {1,0,1,0,1,0,1,0};
    for (int i = 0; i < a.length; i++) {
        if (a[i] == 1) a[i]=0;
        else if (a[i] == 0) a[i]=1;
    }
    System.out.println(Arrays.toString(a));
}
}