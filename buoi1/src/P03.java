import java.util.Scanner;

public class P03 {
    public static boolean check(String s) {
        return s.contains("111");
    }

    public static void solve(int n, String s) {
        if (s.length() == n) {
            System.out.println(s);
            return;
        }
        if (n > 3 && (s.length() + 3 < n || check(s))) {
            solve(n, s + "0");
        }
        solve(n, s + "1");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n, "");
    }
}
