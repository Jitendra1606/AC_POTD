import java.util.Scanner;
import java.util.Arrays;

public class B_Balanced_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();

            if (n % 4 != 0) {
                System.out.println("NO");
            } else {
                int[] arr = new int[n];
                balance(arr);
            }
        }
    }

    static void balance(int[] arr) {
        int n = arr.length;
        System.out.println("YES");
        int even = 2;
        int odd = 1;
        int sumodd = 0;
        int sumeven = 0;

        for (int i = 0; i < n / 2; i++) {
            arr[i] = even;
            sumeven = sumeven + even;
            even = even + 2;
        }
        for (int i = n / 2; i < n - 1; i++) {
            arr[i] = odd;
            sumodd = sumodd + odd;
            odd = odd + 2;
        }

        arr[n - 1] = sumeven - sumodd;
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
        System.out.println();
    }
}