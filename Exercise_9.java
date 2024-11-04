import java.util.Scanner;

public class Exercise_9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = false;
        int year = sc.nextInt();
        if (year%4==0 || year==400) a =true; 
        if (year==100) a =false;
        System.out.println(a);
    }
}