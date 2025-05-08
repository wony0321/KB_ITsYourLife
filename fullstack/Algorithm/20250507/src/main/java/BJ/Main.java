package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int MAX_NUM = Integer.MIN_VALUE;
    static int MIN_NUM = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] matrix = new int[N][3];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }

        int[][] dp_min = new int[N][3];
        int[][] dp_max = new int[N][3];

        for (int j = 0; j < 3; j++) {
            dp_min[0][j] = matrix[0][j];
            dp_max[0][j] = matrix[0][j];
        }

        for (int i = 1; i < N; i++) {
            dp_min[i][0] = Math.min(dp_min[i - 1][0], dp_min[i - 1][1]) + matrix[i][0];
            dp_min[i][1] = Math.min(Math.min(dp_min[i - 1][0], dp_min[i - 1][1]), dp_min[i - 1][2]) + matrix[i][1];
            dp_min[i][2] = Math.min(dp_min[i - 1][1], dp_min[i - 1][2]) + matrix[i][2];

            dp_max[i][0] = Math.max(dp_max[i - 1][0], dp_max[i - 1][1]) + matrix[i][0];
            dp_max[i][1] = Math.max(Math.max(dp_max[i - 1][0], dp_max[i - 1][1]), dp_max[i - 1][2]) + matrix[i][1];
            dp_max[i][2] = Math.max(dp_max[i - 1][1], dp_max[i - 1][2]) + matrix[i][2];
        }

        for (int j = 0; j < 3; j++) {
            MAX_NUM = Math.max(MAX_NUM, dp_max[N - 1][j]);
            MIN_NUM = Math.min(MIN_NUM, dp_min[N - 1][j]);
        }

        System.out.println(MAX_NUM + " " + MIN_NUM);
    }
}
