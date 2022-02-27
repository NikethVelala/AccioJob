import java.util.*;
public class MinLimitOfBallsInABag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int op=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        Arrays.sort(a);
        int i=0,j=a[n-1],ret=a[n-1];
        while(i<=j){
            int mid=i+(j-i)/2;
            if(check(mid,a,op)){
                ret=mid;
                j=mid-1;
            }else i=mid+1;
        }
        System.out.println(ret);
    }

    private static boolean check(int mid, int[] a, int op) {
        for(int i=0;i<a.length;i++){
            op-=a[i]/mid;
            if(a[i]%mid==0) op++;
        }
        return op>=0;
    }
}
