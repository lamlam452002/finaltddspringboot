import java.util.Scanner;

public class P17 {
    int[] x;
    int f;
    int fmin;
    boolean[] visited;
    int load;
    int K;
    int n;
    int[][] c; // distance matrix
    int cm;
    public void input() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt(); K = in.nextInt();
        c = new int[2*n+1][2*n + 1];
        cm = 10000;
        for(int i = 0; i <= 2*n; i++)
            for (int j = 0; j <= 2*n; j++) {
                c[i][j] = in.nextInt();
                if (i != j && c[i][j] < cm) cm = c[i][j];
            }
    }

    private  boolean check(int v, int k) {
        if (visited[v])  return false;
        if (v <= n) {
            if (visited[v + n]) return false;
            if (load >= K) return false;
        }else {
            if (!visited[v - n] ) return false;
        }
        return true;
    }

    public void solve() {
        x = new int[2*n+1]; x[0] = 0; f = 0; fmin = 1000000; load = 0;
        visited = new boolean[2*n+1];
        for (int v = 1; v <= 2*n; v++) visited[v] = false;
        tryValue(1);
        System.out.println(fmin);
    }

    private void solution() {
        if (f + c[x[2*n]][x[0]] < fmin) {
            fmin = f + c[x[2*n]][x[0]];
        }
    }


    private void tryValue(int k) {
        for (int v = 1; v <= 2*n; v++) {
            if (check(v, k)) {
                x[k] = v; visited[v] = true; f = f + c[x[k-1]][x[k]];
                if (v <= n) load += 1; else load -= 1;
                if (k == 2*n) solution();
                else {
                    int g = f + cm * (2 * n - k + 1); //lower bound of the length of the
                    if (g < fmin) tryValue(k + 1);
                }
                if (v <= n) load -= 1; else load += 1;
                visited[v] = false; f = f - c[x[k-1]][x[k]];
            }
        }
    }
    public static void main(String[] args) {
        P17 p = new P17();
        p.input();
        p.solve();
    }
}
