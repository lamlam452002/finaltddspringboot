//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.*;
//class Item{
//    String orderID;
//    String UserID;
//    String timePoint;
//    String Error;
//    int port;
//    public Item(String orderID,String UserID, String timePoint,String Error,int port){
//        this.orderID = orderID; this.timePoint = timePoint;
//        this.Error=Error;
//        this.UserID=UserID;
//        this.port=port;
//    }
//}
//public class Main {
//    public static int hash(String t){
//        // convert time-point t under the format hh:mm:ss to seconds
//        String[] s = t.split(":");
//        int h = Integer.parseInt(s[0]);
//        int m = Integer.parseInt(s[1]);
//        int ss = Integer.parseInt(s[2]);
//        return h*3600 + m*60 + ss;
//    }
//    public static void main(String[] args){
//        //System.out.println("xyz".compareTo("xyz"));
//        //if(true) return;
//        try{
//            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//            String line;
//            ArrayList<Item> L = new ArrayList<Item>();
//            int M = 23*3600 + 59*60 + 59; // max hh:mm:ss
//            int[] a = new int[M+1];
//            int[] t = new int[M+1];
//            for(int i = 0; i <= M; i++) a[i] = 0;
//            while(true){
//                line = in.readLine();
//                if(line.equals("#")) break;
//                String[] s = line.split(" ");
//                int k=Integer.parseInt (s[4]);
//                L.add(new Item(s[0],s[1],s[2],s[3],k));
//                int idx = hash(s[2]);
//                a[idx] += 1;
//            }
//            // compute prefix sum t
//            t[0] = a[0];
//            for(int i = 1; i <= M; i++) t[i] = t[i-1] + a[i];
//            // perform queries
//            while(true){
//                line = in.readLine();
//                if(line.equals("#")) break;
//                String[] s = line.split(" ");
//                // s[0] is the name of the query
//                if(s[0].equals("?total_number_submissions")) System.out.println(L.size());
//                else if(s[0].equals("?number_error_submision")){
//                    int count=0;
//                    for(int i=0;i<L.size();i++)
//                    {   String A =L.get(i).Error;
//                        if(A.equals("ERR"))
//                        {//System.out.println(L.get(i).Error);
//                            count++;}
//                    }
//                    System.out.println(count);
//                }
//                else if(s[0].equals("?number_error_submision_of_user")){
//                    int count=0;
//                    for(int i=0;i<L.size();i++)
//                    {   String A =L.get(i).Error;
//                        String C=L.get(i).orderID;
//                        if(A.equals("ERR")&&s[1].equals(C))
//                        {//System.out.println(L.get(i).Error);
//                            count++;}
//                    }
//                    System.out.println(count);
//
//                }