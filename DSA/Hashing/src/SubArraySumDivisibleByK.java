import java.util.HashMap;
import java.util.Scanner;

public class SubArraySumDivisibleByK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(subarray(a,n,k));
    }

    public static int subarray(int[] a,int n,int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0,sum=0,rem;
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=a[i];
            rem=sum%k;
            if(map.containsKey(rem)){
                count+=map.get(rem);
                map.put(rem,map.get(rem)+1);
            }else map.put(rem,1);
        }
        return count;
    }
}