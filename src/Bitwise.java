import java.util.Arrays;
import java.util.Scanner;

public class Bitwise {
    public static void main(String1[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] a=new long[n];
        for(int i=0;i<n;i++) a[i]=sc.nextLong();
        System.out.println(findLongestSubarray(n, a));
    }

    private static int findLongestSubarray(int n, long[] a) {
        long[] b=new long[n];
        int v=0;
        int count=0,count1=0;
        for(long i:a)
            b[v++]=i;
        Arrays.sort(b);
        long max=b[n-1];
        for(long i:a){
            if(i==max) {
                if (count != 0) count++;
                else count=1;
            }else{
                count1=Math.max(count,count1);
                count=0;
            }
        }
        count1=Math.max(count,count1);
        return count1;
    }
}
