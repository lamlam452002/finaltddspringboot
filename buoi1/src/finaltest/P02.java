//package finaltest;
//
//import java.util.*;
//
//public class P02 {
//    static int n;
//    static int k;
//    static int A;
//    static int B;
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//
//            n = sc.nextInt();
//            k = sc.nextInt();
//            A = sc.nextInt();
//            B = sc.nextInt();
//            int[] array = new int[n];
//
//            for (int i = 0; i < n; i++) {
//                array[i] = sc.nextInt();
//            }
//
//            int count = countValidSubarrays(array, k);
//            System.out.println(count);
//
//            sc.close();
//        }
//
//        private static int countValidSubarrays(int[] array, int k) {
//            Set<List<Integer>> uniqueSubarrays = new HashSet<>();
//            generateSubarrays(array, k, 0, new ArrayList<>(), uniqueSubarrays);
//            return uniqueSubarrays.size();
//        }
//
//        private static void generateSubarrays(int[] array, int k, int start, List<Integer> current, Set<List<Integer>> uniqueSubarrays) {
//            if (current.size() == k) {
//                int sum = current.stream().mapToInt(Integer::intValue).sum();
//                if (sum > A && sum < B) {
//                    uniqueSubarrays.add(new ArrayList<>(current));
//
//                return;
//            }
//
//            for (int i = start; i < array.length; i++) {
//                current.add(array[i]);
//                generateSubarrays(array, k, i + 1, current, uniqueSubarrays);
//                current.remove(current.size() - 1);
//            }
//        }
