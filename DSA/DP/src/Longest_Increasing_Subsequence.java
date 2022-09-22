// https://www.youtube.com/watch?v=cjWnW0hdF1Y
import java.util.Scanner;

public class Longest_Increasing_Subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(longestIncreasingSubsequence(a));
    }

    private static int longestIncreasingSubsequence(int[] a) {
        int[] b=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            b[i]=1;
            for(int j=i+1;j<a.length;j++)
                if(a[i]<a[j])
                    b[i]=Math.max(b[i],1+b[j]);
        }
        int max=0;
        for(int i:b) max=Math.max(max,i);
        return max;

    }

    //using binary search
    private static int longestIncreasingSubsequence1(int[] nums) {
    int[] tails = new int[nums.length];
    int size = 0;
    for (int x : nums) {
        int i = 0, j = size;
        while (i != j) {
            int m = (i + j) / 2;
            if (tails[m] < x)
                i = m + 1;
            else
                j = m;
        }
        tails[i] = x;
        if (i == size) ++size;
    }
    return size;
    }
}
