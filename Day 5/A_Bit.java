import java.util.Scanner;

public class A_Bit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] a = new String[n]; // We are storing elements in string array bcz they are kind of strings
        for (int i = 0; i < n; i++) {
            a[i] = in.next(); // taking input of n elements
        }
        System.out.println(solve(a, n));
    }

    static int solve(String[] a, int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i].contains("++")) { // checking if the string contains "++"
                ans++;                    //not using .equals bcz we just need to check if it contains "++" or "--"
            } else if (a[i].contains("--")) {
                ans--;
            }
        }
        return ans;
    }
}