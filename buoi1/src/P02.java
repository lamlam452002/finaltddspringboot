import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        Map<String, Integer> map = new HashMap<>();


        while (true) {
            line = sc.nextLine();
            if (line.equals("#")) break;
            String[] s = line.trim().split(" ");
            if (map.get(s[1]) == null) map.put(s[1], 1);
             else {
                int cnt = map.get(s[1]);
                cnt ++;
                map.put(s[1], cnt);
            }
        }
        while (true) {
            line = sc.nextLine();
            String[] ans = line.trim().split(" ");
            if (line.equals("#")) break;
            if (line.contains("?check_phone_number")) {

            }
            if (line.contains("?number_total_calls")) {
                System.out.println(ans.length);
            }
            if (line.contains("?number_calls_from")) {
                if (line.contains(ans[1])) {
                    System.out.println(map.get(ans[1]));
                }
            }
        }
    }
}
