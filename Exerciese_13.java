public class Exerciese_13 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int[][] a = new int[x][y];
        for (int i = 0; i < a.length; i++) {
            a[i][a.length - i - 1] = 1;
        }
        for (int i = 0; i < a.length; i++) {
            for (int o = 0; o < a.length; o++) {
                a[i][i] = 1;
                System.out.print(a[i][o] + " ");
            }
            System.out.println();
        }
    }
}