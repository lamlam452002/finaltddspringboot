import java.util.Scanner;

public class TSP {
    int[] x; //Solution representation
    boolean[] visited;
    int[][] c;
    int n;
    int f;
    int fmin;
    int cm;
    private boolean check(int v, int k) {
        return visited[v] == false;
    }

    private void tryValue(int k) {
        for (int v = 1; v <=n; v ++) {
            if (check(v, k)) {
                x[k] = v;
                visited[v] = true;
                f = f + c[x[k - 1]][x[k]];
                if (k == n) solution();
                else {
                    int g = f + cm * (n - k + 1); //lower bound of the length of the
                    if (g < fmin) tryValue(k + 1);
                }
                visited[v] = false;
                f = f - c[x[k - 1]][x[k]];
            }
        }
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        c = new int[n + 1][n + 1];
        cm = 1000000;
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++) {
                c[i][j] = in.nextInt();
                if (i != j && c[i][j] < cm) cm = c[i][j];
            }
    }

    public void solve() {
        x = new int[n + 1]; visited = new boolean[n + 1];
        for (int v = 1; v <= n; v++) visited[v] = false;
        x[1] = 1; visited[1] = true; fmin = 1000000;
        tryValue(2);
        System.out.print(fmin);
    }

    private void solution() {
        if (f +c[x[n]][x[1]] < fmin) {
            fmin = f + c[x[n]][x[1]];
        }
    }

    public static void main(String[] args) {
        TSP tsp = new TSP();
        tsp.input();
        tsp.solve();
    }
}
