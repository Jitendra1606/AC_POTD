import java.util.*;

public class A_Three_Pairwise_Maximums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int[] arr = new int[3];
            arr[0] = in.nextInt();
            arr[1] = in.nextInt();
            arr[2] = in.nextInt();
            Arrays.sort(arr);// sort numbers
            // if last two numbers are not equal then not possible
            if (arr[1] != arr[2]) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(arr[0] + " " + arr[1] + " " + arr[0]);
            }
        }
        in.close();
    }
}