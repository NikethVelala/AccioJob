import java.util.Scanner;

public class TW_Priya {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0;z<t;z++) {
            int n=sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            System.out.println(solve(n,a));
        }


    }

    private static long solve(int n, int[] a) {
        long sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                if((a[j-1]&a[i-1])>0)
                    for(int k=1;k<=i;k++)
                        sum+=a[i-1]^a[k-1];
            }
        }
        sum%=1000000007;
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if((a[j-1]&a[i-1])>0)
                    for(int k=i;k<=n;k++)
                        sum+=a[i-1]^a[k-1];
            }
        }

        return sum%1000000007;
    }
}
