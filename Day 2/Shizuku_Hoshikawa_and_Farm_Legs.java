import java.util.Scanner;

public class Shizuku_Hoshikawa_and_Farm_Legs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] results = new int[t];
        int i = 0;
        while (i < t) {
            results[i] = in.nextInt();
            i++;
        }
        farmlegs(results);
    }

    static void farmlegs(int[] results) {
        for (int i = 0; i < results.length; i++) {
            if (results[i] % 2 != 0) {
                System.out.println("0");
            } else {
                System.out.println(results[i] / 4 + 1);
            }
        }
    }
}
