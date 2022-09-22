//Important problem
//https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1
import java.util.*;

public class SubarrayWithZeroSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(findsum(a,n));
    }

    static boolean findsum(int a[],int n) {
        HashSet<Integer> map=new HashSet<>();
        int i=0,sum=0;
        map.add(0);
        while(i<n){
            sum+=a[i];
            if(map.contains(sum)) return true;
            else map.add(sum);
            i++;
        }
        return false;
    }
}
