import java.util.Scanner;

public class P19 {
    public static boolean check(String s) {
        return s.endsWith("1");
    }

    public static void solve(int n, String s) {
        if (s.length() == n) {
            System.out.println(s);
            return;
        }
        solve(n, s + "0");
        if (!check(s)) {
            solve(n, s + "1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n, "");
    }
}
