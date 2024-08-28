import java.util.*;

class ItemNode {
    int v;
    int d;
    public ItemNode(int v, int d) {
        this.v = v;
        this.d = d;
    }
}
public class P28 {
    int n;
    int m;
    List<ItemNode>[] A;
    int s, t;
    int[] d;
    public void input () {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        A =  new ArrayList[n + 1];
        for (int v = 1; v <= n; v++) A[v] = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
        }
        s = sc.nextInt();
        t = sc.nextInt();
        sc.close();
    }

    public void dijkstra() {
        PriorityQueue<ItemNode> pq = new PriorityQueue<>(new Comparator<ItemNode>() {
            @Override
            public int compare(ItemNode o1, ItemNode o2) {
                if (o1.d > o2.d) return 1;
                else if (o1.d < o2.d) return -1;
                else return 0;
            }
        });
        d = new int[n + 1];
        int res = -1;
        for (int v = 1; v <= n; v++) d[v] = Integer.MAX_VALUE;
        d[s] = 0;
        pq.add(new ItemNode(s, d[s]));
        while (!pq.isEmpty()) {
            ItemNode cur = pq.remove();
            int u = cur.v;
            if (u == t)  {
                res = d[t]; break;
            }
            for (ItemNode e : A[u]) {
                int v = e.v;
                int w = e.d;
                if (d[v] < d[u] + w) {
                    d[v] = d[u] + w;
                    pq.add(new ItemNode(v, d[v]));
                }
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        P28 p28 = new P28();
        p28.input();
        p28.dijkstra();
    }


//    public static void main(String[] args) {
//        PriorityQueue<ItemNode> pq = new PriorityQueue<ItemNode>(new Comparator<ItemNode>() {
//            public int compare(ItemNode o1, ItemNode o2) {
//                if (o1.d > o2.d) return 1;
//                if (o1.d < o2.d) return -1;
//                return 0;
//            }
//        });
//        pq.add(new ItemNode(1, 20));
//        pq.add(new ItemNode(2, 0));
//        pq.add(new ItemNode(3, 30));
//        pq.add(new ItemNode(4, 10000000));
//        pq.add(new ItemNode(5, 4));
//        pq.add(new ItemNode(6, 10000000));
//        pq.add(new ItemNode(7, 2));
//        while (!pq.isEmpty()) {
//            ItemNode item = pq.poll();
//            System.out.println("POP(" + item.v + "," + item.d + ")");
//        }
//    }
}
