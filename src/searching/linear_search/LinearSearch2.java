package searching.linear_search;

import java.util.Arrays;
import java.util.Scanner;

//it works only with sorted array.
public class LinearSearch2 {
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

        int index = 0;
        while (index < n && arr[index] < element)
            index++;
        if (index > n || arr[index] > element)
            System.out.println("element not found");

        System.out.println("element " + element + " found at " + index + " position");


    }
}
