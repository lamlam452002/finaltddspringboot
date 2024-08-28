import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class P18 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            Map<String, Integer> map = new TreeMap<String, Integer>();
            while (true) {
                line = br.readLine();
                if (line.equals("#")) break;
                String[] s = line.split(" ");
                String userID = s[0]; String time = s[1];
                if (map.get(userID) == null) map.put(userID, 1);
                else {
                    int cnt = map.get(userID);
                    cnt = cnt + 1;
                    map.put(userID, cnt);
                }
            }
            map.forEach((k, v) ->
                    System.out.println(k + " " + v));
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
