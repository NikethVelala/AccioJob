import java.util.Scanner;

public class Fnd1stnLst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int left=findLeft(a,n,target);
        int right=findRight(a,n,target);
        System.out.print(left+" "+right);
    }

    private static int findRight(int[] a, int n, int target) {
        int ret=-1;
        int i=0,j=n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(a[mid]==target){
                ret=mid;
                i=mid+1;
            }else if(a[mid]>target) j=mid-1;
            else i=mid+1;
        }

        return ret;
    }

    private static int findLeft(int[] a, int n,int target) {
        int ret=-1;
        int i=0,j=n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(a[mid]==target){
                ret=mid;
                j=mid-1;
            }else if(a[mid]<target) i=mid+1;
            else j=mid-1;
        }

        return ret;
    }
}
