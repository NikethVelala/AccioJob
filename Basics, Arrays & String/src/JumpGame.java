import java.util.Scanner;

public class JumpGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(jumpGame(a,n));
    }

    private static boolean jumpGame(int[] a, int n) {
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,i+a[i]);
            if(max>=a.length) return true;
            if(i+1>max) return false;
        }
        return false;
    }
}
