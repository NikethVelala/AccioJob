import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class kthsmallestelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        System.out.println(small(a,k));
    }

    private static int small(int[] a,int k) {
        Set<Integer> set=new HashSet<>();
        for (int i:a) set.add(i);
        int count=0;
        for (int i:set){
            if(count++==k-1)
                return i;
        }
        return -1;
    }
}
