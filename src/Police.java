import java.util.Arrays;
import java.util.Scanner;

public class Police {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];
        int a1 = sc.nextInt();
        for(int i=0;i<n;i++) a[i] = sc.nextInt();

        System.out.println(solve(n,a1 ,a));
    }

    public static int solve(int n, int a, int[] x) {
        int max1 = 0,max2 = 0;
        //max1 = Math.abs(a - x[0]);
        //max2 = Math.abs(a - x[0]);
        for(int i=0;i<n;i++)
            if(max1<=Math.abs(a - x[i])){
                max2 = max1;
                max1 = Math.abs(a - x[i]);
            }
        return max1+max2;
    }
}
