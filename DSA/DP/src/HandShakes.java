//https://practice.geeksforgeeks.org/problems/handshakes1303/1  https://www.youtube.com/watch?v=J3Mtaa0jv6s
import java.util.Scanner;
public class HandShakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(count(n));
    }

    private static int count(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        for(int i=2;i<=n;i+=2){
            for(int j=0;j<=i-2;j+=2){
                dp[i]+=dp[j]*dp[i-2-j];
            }
        }
        return dp[n];
    }
}
