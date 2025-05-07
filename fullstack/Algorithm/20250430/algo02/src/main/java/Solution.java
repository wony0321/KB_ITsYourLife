import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // 입력을 위한 Scanner 생성
        Scanner sc = new Scanner(System.in);

        // 코인 종류 개수 입력
        System.out.print("코인 개수 입력: ");
        int n = sc.nextInt();

        // 코인 종류 입력
        int[] coins = new int[n];
        System.out.println("각 코인 값을 입력:");
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        // 목표 금액 입력
        System.out.print("목표 금액 입력: ");
        int amount = sc.nextInt();

        // Solution 객체 생성 후 메서드 호출
        Solution solution = new Solution();
        int result = solution.coinChange(coins, amount);

        // 결과 출력
        System.out.println("결과: " + result);
    }

    public int coinChange(int[] coins, int amount) {
        // coins 안에 있는 숫자 중복해서 사용 가능

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);

        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        return 0;
    }
}
