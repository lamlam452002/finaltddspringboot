
import java.util.Scanner;

public class PermutationGeneration {
    private static void generatePermutations(int[] array, int start, int end) {
        if (start == end) {
            printPermutation(array);
        } else {
            for (int i = start; i <= end; i++) {
                swap(array, start, i);
                generatePermutations(array, start + 1, end);
                swap(array, start, i);
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printPermutation(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print(array[array.length - 1]);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[] array = new int[n];
        for (int i = 1; i <= n; i++) {
            array[i - 1] = i;
        }

        generatePermutations(array, 0, n - 1);
    }
}
