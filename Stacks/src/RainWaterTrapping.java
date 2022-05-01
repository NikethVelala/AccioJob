//5
import java.util.Scanner;

public class RainWaterTrapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println(rainWaterTrapping(a,n));
    }

    private static int rainWaterTrapping(int[] a, int n) {
        int[] left= new int[n];
        int[] right=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<a[i]) max=a[i];
            left[i]=max;
        }
        for(int i=n-1;i>-1;i--){
            if(max<a[i]) max=a[i];
            right[i]=max;
        }
        int count=0;
        for(int i=0;i<n;i++)
            count+=Math.min(left[i],right[i])-a[i];
        return count;
    }
}
