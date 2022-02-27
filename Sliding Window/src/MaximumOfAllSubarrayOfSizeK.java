import java.util.Scanner;

public class MaximumOfAllSubarrayOfSizeK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int[] b=subarrays(a,k,n);
        for(int i:b)
            System.out.print(i+" ");
    }

    private static int[] subarrays(int[] a, int k, int n) {
        int[] b=new int[n-k+1];


        return b;
    }
}
