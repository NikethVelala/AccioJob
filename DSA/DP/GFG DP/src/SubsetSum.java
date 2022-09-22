import java.util.Scanner;

public class SubsetSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int k=sc.nextInt();
        //Using recursion
        //System.out.println(subsetSum(a,k,0,0));
        //Using DP
        System.out.println(subsetSum(a,k));
    }

    //Using DP
    public static boolean subsetSum(int[] a, int k) {
        boolean[][] arr = new boolean[a.length + 1][k + 1];
        for (int i = 0; i < a.length + 1; i++)
            for (int j = 0; j < k + 1; j++) {
                if (i == 0) arr[i][j] = false;
                if (j == 0) arr[i][j] = true;
            }
        for (int i = 1; i < a.length + 1; i++) {
            for (int j = 1; j < k + 1; j++) {
                if (a[i - 1] <= j)
                    arr[i][j] = arr[i-1][j - a[i - 1]] || arr[i - 1][j];
                else
                    arr[i][j] = arr[i - 1][j];
            }
        }
        return arr[a.length][k];
    }

    //Using recursion
    public static boolean subsetSum(int[] a, int k, int sum,int i) {
        if(sum==k) return true;
        if(i==a.length||sum>k) return false;
        return subsetSum(a,k,sum+a[i],i+1)||subsetSum(a,k,sum,i+1);
    }
}
