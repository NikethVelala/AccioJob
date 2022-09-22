//important problem
//https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1#
import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(lenOfLongSubarr(a,n,k));
    }
    public static int lenOfLongSubarr (int a[], int n, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(a[0],0);
        int maxC=0;
        if(a[0]==k) maxC=1;
        for(int i=1;i<n;i++){
            a[i]+=a[i-1];
            if(!map.containsKey(a[i])) map.put(a[i],i);
            if(a[i]==k) maxC=i+1;
            else{
                if(map.containsKey(a[i]-k))
                    maxC=Math.max(maxC,i-map.get(a[i]-k));
            }
        }
        return maxC;
    }
}
