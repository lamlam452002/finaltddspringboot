import java.util.*;

public class P27 {
    class Edge {
        int u;
        int v;
        int w;

        public Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }
    int n;
    int m;
    List<Edge> E;
    public void input(){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        E = new ArrayList<Edge>();
        for(int i = 1; i <= m; i++){
            int u = in.nextInt(); int v = in.nextInt(); int w = in.nextInt();
            E.add(new Edge(u, v, w));
        }
        in.close();
    }

    public void kruskal(){
        DisjointSet DS = new DisjointSet(n);
        for(int v = 1; v <= n; v++) DS.makeSet(v);
        Collections.sort(E, new Comparator<Edge>(){
            @Override
            public int compare(Edge o1, Edge o2) {
                if(o1.w <o2.w) return -1;
                else  if(o1.w >o2.w) return 11;
                else return 0;
            }
        });
//        for(Edge e: E){
//            System.out.println(e.u + " " + e.v + " " + e.w);
//        }
        int res = 0; // tổng trọng số của cây
        List<Edge> ET = new ArrayList<Edge>();//
        for(Edge e :E){
            int u = e.u; int v = e.v; int w = e.w;
            int ru = DS.find(u); int rv = DS.find(v);
            if(ru != rv){
                res = res + w;
                DS.unify(ru, rv); // hợp nhất 2 tập hợp thành 1
                ET.add(e);
                if(ET.size() == n-1) break;
            }
        }
        System.out.println(res);

    }
    public static void main(String[] args) {
        P27 p = new P27();
        p.input();
        p.kruskal();

    }
}
