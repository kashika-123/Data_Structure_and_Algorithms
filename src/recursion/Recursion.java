package recursion;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int resultIterative = iterativeFactorial(n);
        int resultRecursive = recursiveFactorial(n);
        System.out.println(resultIterative);
        System.out.println(resultRecursive);
    }

    public static int iterativeFactorial(int num) {
        if (num == 0)
            return 1;
        int factorial = 1;
        for (int i = 1; i <= num; i++)
            factorial *= i;
        return factorial;

    }

    public static int recursiveFactorial(int num) {
        if (num == 0)
            return 1;
        return num * recursiveFactorial(num - 1);
    }
}
