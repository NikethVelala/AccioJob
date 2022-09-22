import java.util.Scanner;

public class MinimumNumberOfDaysToMakeMBouquets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int m=sc.nextInt(), k=sc.nextInt();
        System.out.println(minDays(a,m,k));
    }

    private static int minDays(int[] a, int m, int k) {
        int l=1,r=-1,mid;
        for(int i:a) r = Math.max(r,i);

        while(l<r){
            mid = (l+r)/2;
            if(feasible(a,m,k,mid))
                r = mid;
            else
                l=mid+1;
        }
        return l;
    }

    private static boolean feasible(int[] a, int m, int k, int mid) {
        int count=0,count1=0;
        for(int i=0;i<a.length;i++) {
            if (a[i] <= mid)
                count1++;
            else count1=0;
            if(count1==k) {
                count++;
                count1 = 0;
            }
        }
        return count >= m;
    }
}
