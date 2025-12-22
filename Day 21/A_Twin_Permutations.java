import java.util.*;

public class A_Twin_Permutations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            int[] ans = permute(arr);
            for (int k = 0; k < n; k++) {
                System.out.print(ans[k] + " ");
            }
            System.out.println();
        }
    }

    static int[] permute(int[] arr) {
        int n = arr.length;
        int[] brr = new int[n];
        for (int i = 0; i < n; i++) {
            brr[i] = n + 1 - (arr[i]);
        }
        return brr;
    }
}
