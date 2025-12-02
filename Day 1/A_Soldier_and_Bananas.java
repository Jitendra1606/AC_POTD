import java.util.Scanner;

public class A_Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();
        System.out.println(borrow(k, n, w));
    }

    static int borrow(int k, int n, int w) {
        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum = sum + (i * k);
        }
        return Math.max(sum - n, 0);
    }
}