import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = br.readLine();
            int T = Integer.parseInt(line);
            for (int t = 0; t < T; t++) {
                line = br.readLine();
                int n = Integer.parseInt(line.split(" ")[0]);
                int m = Integer.parseInt(line.split(" ")[1]);
                line = br.readLine();
                String[] a =line.split(" ");
                System.out.println(Arrays.toString(a));
                line = br.readLine();
                String[] b =line.split(" ");
                boolean areEqual = n == m;
                if (areEqual) {
                    for (int i = 0; i < n; i++) {
                        if (!(a[i].equals(b[i]))) {
                            areEqual = false;
                            break;
                        }
                    }
                } else {
                    areEqual = false;
                }
                System.out.println(areEqual ? 1 : 0);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
