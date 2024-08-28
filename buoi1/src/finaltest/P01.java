package finaltest;

import java.util.Scanner;

public class P01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] tmp = new int[n + 1];
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                tmp[i] = tmp[i - 1] + a[i];
            }
            int k = sc.nextInt();
            for (int i = 1; i <= k; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int sum = tmp[y] - tmp[x - 1];
                System.out.println(sum);
            }
        }
    }