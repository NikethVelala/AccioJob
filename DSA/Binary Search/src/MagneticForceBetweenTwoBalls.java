import java.util.Arrays;
import java.util.Scanner;

public class MagneticForceBetweenTwoBalls {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(magneticForce(a,m));
    }

    private static int magneticForce(int[] a, int m) {
        Arrays.sort(a);
        int l=a[0],r=a[a.length-1];
        while(l<=r){
            int mid=(l+r)/2;
            if(possible(a,m,mid))
                l=mid+1;
            else r=mid-1;
        }
        return l-1;
    }

    private static boolean possible(int[] a, int m, int mid) {
        int start=a[0];
        m--;
        for(int i=1;i<a.length;i++){
            if(a[i]>=mid+start){
                m--;
                start=a[i];
            }
        }
        return m<=0;
    }
}
