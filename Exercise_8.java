import java.util.Scanner;

public class Exercise_8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String y = sc.nextLine();
        var r = y.repeat(x);
        System.out.println(r);
    }
}