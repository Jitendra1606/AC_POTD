import java.util.Scanner;

public class A_Chewbacca_and_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        for (int i = 0; i < arr.length; i++) {
            int inv = 9 - arr[i];
            if (i == 0 && inv == 0) {
                continue;
            }
            if (inv < arr[i]) {
                arr[i] = inv;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}