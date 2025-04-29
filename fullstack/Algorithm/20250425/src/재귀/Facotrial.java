package 재귀;

import java.util.Arrays;
import java.util.Scanner;

public class Facotrial {
    public static void main(String[] args) {
        int num = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        num = sc.nextInt();
        int result = factorial(num);
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return factorial(n-1) * factorial(n-2);
        }
    }
}
