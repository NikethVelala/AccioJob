import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        int x=sc.nextInt();
        System.out.println(sumEvenOdd(a,n,x));
    }

    public static int sumEvenOdd(int[][] a, int n, int x) {
        int s=0,r=0,c=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(a[i][j]==x){
                    r=i+1;
                    c=j+1;
                    break;
                }
        if((r+c)%2==0){
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    if(a[i][j]%2==0)
                        s+=getSum(a[i][j]);
        }else{
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    if(a[i][j]%2!=0)
                        s+=getSum(a[i][j]);
        }
        return s;
    }

    public static int getSum(int n) {
        return n == 0 ? 0 : n % 10 +getSum(n/10) ;
    }
}
