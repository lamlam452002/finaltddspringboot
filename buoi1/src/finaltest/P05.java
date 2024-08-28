package finaltest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P05 {

        static class Point {
            int x, y;

            Point(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] firstLine = br.readLine().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            double D = Double.parseDouble(firstLine[1]);

            Point[] points = new Point[n + 1];
            for (int i = 1; i <= n; i++) {
                String[] line = br.readLine().split(" ");
                int x = Integer.parseInt(line[0]);
                int y = Integer.parseInt(line[1]);
                points[i] = new Point(x, y);
            }

            boolean[] visited = new boolean[n + 1];
            Queue<Integer> queue = new LinkedList<>();
            int[] distance = new int[n + 1];

            queue.add(1);
            visited[1] = true;
            distance[1] = 0;

            while (!queue.isEmpty()) {
                int current = queue.poll();

                if (current == n) {
                    System.out.println(distance[n]);
                    return;
                }

                for (int i = 1; i <= n; i++) {
                    if (!visited[i] && distance(current, i, points) <= D) {
                        queue.add(i);
                        visited[i] = true;
                        distance[i] = distance[current] + 1;
                    }
                }
            }

            System.out.println(-1);
        }

        private static double distance(int i, int j, Point[] points) {
            return Math.sqrt(Math.pow(points[i].x - points[j].x, 2) + Math.pow(points[i].y - points[j].y, 2));
        }
    }
