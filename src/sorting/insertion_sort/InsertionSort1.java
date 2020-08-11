package sorting.insertion_sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < n; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex - 1; i >= 0 && arr[i] > newElement; i--) {
                arr[i + 1] = arr[i];
            }
            arr[i + 1] = newElement;
            System.out.println(Arrays.toString(arr));


        }


        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }


    }
}
