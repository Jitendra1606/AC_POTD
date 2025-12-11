import java.util.Scanner;

public class B_Even_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            System.out.println(solve(arr));
        }
        in.close();
    }

    static int solve(int[] arr) {
        int iseven = 0;
        int isodd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != i % 2) {
                if (i % 2 == 0) {
                    iseven++;
                } else {
                    isodd++;
                }
            }
        }
        if (iseven != isodd) {
            return -1;
        } else {
            return iseven;
        }
    }
}