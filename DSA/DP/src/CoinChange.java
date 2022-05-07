import java.util.Scanner;

//https://www.youtube.com/watch?v=H9bfqozjoqs

public class CoinChange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] coins=new int[n];
        for(int i=0;i<n;i++) coins[i]=sc.nextInt();
        int amount=sc.nextInt();
        System.out.println(coinChange(coins,amount));
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        for(int i=1;i<amount+1;i++)
            dp[i]=amount+1;

        for(int i=1;i<amount+1;i++)
            for(int j:coins)
                if(i-j>=0)
                    dp[i]=Math.min(dp[i],1+dp[i-j]);

        return dp[amount]!=amount+1?dp[amount]:-1;
    }
}
// https://www.youtube.com/watch?v=H9bfqozjoqs
// Time complexity = O(amount*len(coins))
// space complexity = O(amount)