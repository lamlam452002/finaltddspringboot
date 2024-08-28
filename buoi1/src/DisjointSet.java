public class DisjointSet {
    int[] p; // p[x] is the parent of x
    int[] r; // r[x] is the rank (height) of x
    public int find(int x) {
        if (x != p[x]) {
            p[x] = find(p[x]);
        }
        return p[x];
    }

    public DisjointSet (int n) {
        p = new int[n + 1];
        r = new int[n + 1];
    }

    public void makeSet(int x) {
        p[x] = x;
        r[x] = 0;
    }

    public void unify(int x, int y) {
        if (r[x] > r[y]) p[y] = x;
        else {
            p[x] = y;
            if (r[x] == r[y]) r[y] += 1;
        }
    }
    public static void main(String[] args) {}
}
