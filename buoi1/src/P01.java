import java.util.*;

public class P01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int cnt = 0;


        for (int i = 0; i < n; i++) {
            if (map.containsKey(M - a[i])) continue;
            if (M - a[i] < n && M - a[i] != M /2) {
                map.put(a[i], M - a[i]);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
