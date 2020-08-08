package sorting.bubble_sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int unsortedPartitionIndex = array.length - 1; unsortedPartitionIndex > 0; unsortedPartitionIndex--) {


        }
        System.out.println(Arrays.toString(array));

    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


}
