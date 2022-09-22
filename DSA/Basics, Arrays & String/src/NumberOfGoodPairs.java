import java.util.HashMap;
import java.util.Scanner;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(a[i])) map.put(a[i],map.get(a[i])+1);
            else map.put(a[i],1);
        }
        int count=0;
        for(int i:map.values())
            if(i>1)
                count+=(i*(i-1))/2;
        System.out.println(count);
    }
}
