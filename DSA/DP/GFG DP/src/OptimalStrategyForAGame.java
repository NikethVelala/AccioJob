import java.util.Arrays;
import java.util.Scanner;

public class OptimalStrategyForAGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] dp = new long[n + 1][n + 1];
        for (long[] row : dp) Arrays.fill(row, -1);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.println(memo(0, n - 1, a, dp));
    }

    static long memo(int st, int end, int[] arr, long[][] dp) {
        if (st > end) return 0;

        if (dp[st][end] != -1) return dp[st][end];

        long first = arr[st] + Math.min(memo(st + 1, end - 1, arr, dp), memo(st + 2, end, arr, dp));
        long sec = arr[end] + Math.min(memo(st + 1, end - 1, arr, dp), memo(st, end - 2, arr, dp));

        return dp[st][end] = Math.max(first, sec);
    }
}
