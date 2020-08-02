package searching.linear_search;

import java.util.Scanner;

public class LinearSearch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int element = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (element == arr[i])
                System.out.println("element" + element + "found at" + i + "position");
        }
    }
}
