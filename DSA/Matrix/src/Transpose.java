import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        int[][] b=transpose(a);
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++)
                System.out.print(b[i][j]+" ");
            System.out.println();
        }
    }

    private static int[][] transpose(int[][] a) {
        for(int i=0;i<a.length;i++){
            for(int j=i;j< a.length;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        return a;
    }
}
