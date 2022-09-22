import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sqrt(n));
    }

    private static int sqrt(int n) {
        int ret=0,l=1,h=n/2,mid;
        while(l<=h){
             mid=l+(h-l)/2;
             if(mid*mid==n) return mid;
             else if(mid*mid>n) h=mid-1;
             else{
                 l=mid+1;
                 ret = mid;
             }
        }
        return ret;
    }
}
