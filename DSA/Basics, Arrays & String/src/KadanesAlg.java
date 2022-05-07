import java.util.Scanner;

public class KadanesAlg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(Kadanes(a,n));
    }

    private static long Kadanes(int[] a, int n) {
    long end=0,max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        end+=a[i];
        max=Math.max(max,end);
        if(end<0) end=0;
    }
    return max;
    }
}
