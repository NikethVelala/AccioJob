import java.util.*;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int index=sc.nextInt();
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int[] b=firstAndlast(a,index);
        for(int i:b)
            System.out.print(i+ " ");
    }

   /* private static int[] firstAndlast(int[] a, int index) {
        Arrays.sort(a);
        int[] b=new int[2];
        for(int i=0;i<a.length;i++)
            if(a[i]==index) {
                b[0] = i;
                break;
            }
        for(int i=a.length-1;i>=0;i--)
            if(a[i]==index) {
                b[1] = i;
                break;
            }
        return b;
    }*/


    private static int[] firstAndlast(int[] a, int index){
        Arrays.sort(a);
        int left=leftIndex(a,index);
        int right=rightIndex(a,index);
        return new int[]{left,right};
    }

    private static int rightIndex(int[] a, int index) {
        int l=0,r=a.length,ret=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]==index) {
                ret = mid;
                l=mid+1;
                if(a[r]>index) return ret;
            }else if(a[mid]>index)r=mid-1;
            else l=mid+1;
        }
        return ret;
    }

    private static int leftIndex(int[] a, int index) {
        int l=0,r=a.length,ret=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]==index) {
                ret = mid;
                r=mid-1;
                if(a[r]<index) return ret;
            }else if(a[mid]>index)r=mid-1;
            else l=mid+1;
        }
        return ret;
    }
}
