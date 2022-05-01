import java.util.Scanner;

public class ArrangingCoins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(arrangeCoins(sc.nextInt()));
    }

    public static int arrangeCoins(int n) {
        int l=1,r=n;
        while(l<=r){
            int mid=l+(r-l)/2;
            int res=mid*(mid+1)/2;
            if(res==n) return mid;
            else if(res>n) r=mid-1;
            else{
                l=mid+1;
            }
        }
        return r;
    }
}
