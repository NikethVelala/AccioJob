//Import problem

import java.util.*;
public class CountNoOfNiceSubarrays {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            if(sc.nextInt()%2==0) a[i]=0;
            else a[i]=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,count=0;
        map.put(0,1);
        for (int i=0;i<n;i++){
            sum+=a[i];
            if(map.containsKey(sum)) map.put(sum,map.get(sum)+1);
            else map.put(sum,1);
            if(map.containsKey(sum-k))
                count+=map.get(sum-k);
        }
        System.out.print(count);
    }
}