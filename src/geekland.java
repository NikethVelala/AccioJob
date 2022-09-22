import java.util.Arrays;
import java.util.Scanner;

public class geekland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int[] a=new int[t];
        int n1=sc.nextInt();
        for(int i=0;i<t;i++) a[i]=sc.nextInt();
        System.out.println(colosseum(n1,a));
    }

    public static long colosseum(int n1,int a[]) {
        int n=a.length;
        int[] a2;
        int[] a1 = new int[n / 2];
        if(a.length%2==0)  a2 = new int[n/2];
        else a2 = new int[n/2+1];
        for(int i=0;i<n;i++){
            if(i<n/2) a1[i]=a[i];
            else a2[i-n/2]=a[i];
        }
        Arrays.sort(a1);
        Arrays.sort(a2);

        long sum1 = 0, sum2 = 0;
        int i;
        for (i = n / 2 - 1; i >= n / 2 - n1; i--)
            sum1 += a1[i];
        System.out.println();
        for (i = n / 2; i < n / 2 + n1; i++) {
            int kk=i-n/2;
            sum2 += a2[i - n / 2];
        }

        return sum1 - sum2;
    }

}
