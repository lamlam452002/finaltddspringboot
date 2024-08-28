import java.util.Scanner;

public class BinarySequences {
    public static void solve(int n, String s) {
        if (s.length() == n) {
            System.out.println(s);
            return;
        }
        solve(n, s + "0");
        solve(n, s + "1");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n, "");
    }
}
