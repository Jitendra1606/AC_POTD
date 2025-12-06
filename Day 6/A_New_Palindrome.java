import java.util.*;

public class A_New_Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String[] sc = new String[t];
        in.nextLine();
        for (int i = 0; i < t; i++) {
            sc[i] = in.nextLine();
        }
        for (int i = 0; i < t; i++) {
            if (ispalind(sc[i])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean ispalind(String s) {
        Set<Character> unique = new HashSet<>();
        for (int i = 0; i < s.length() / 2; i++) {
            unique.add(s.charAt(i));
        }
        if (unique.size() > 1) {
            return true;
        }
        return false;
    }
}
