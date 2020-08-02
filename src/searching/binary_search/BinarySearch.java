package searching.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("enter the element to be searched");
        int element = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int middle = (low + high) / 2;
            if (arr[middle] == element) {
                System.out.println("element " + element + " found at " + middle + " position");
                break;
            } else if (arr[middle] < element) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }

        }

    }
}

