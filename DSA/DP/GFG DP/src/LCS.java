import java.util.Scanner;

public class LCS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next(),s2=sc.next();
        //System.out.println(lcsUsingRecursion(s1,s2,s1.length(),s2.length()));
        //int[][] t=new int[s1.length()+1][s2.length()+1];
        //for(int i=0;i<s1.length()+1;i++) for(int j=0;j<s2.length()+1;j++) t[i][j]=-1;
        //System.out.println(lcsUsingRecursion(s1,s2,s1.length(),s2.length(),t));

        System.out.println(lcs(s1,s2));
    }

    //Using bottom-up approach
    public static int lcs(String s1, String s2) {
        int[][] t=new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<s1.length()+1;i++)
            for (int j = 1; j < s2.length() + 1; j++)
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    t[i][j]=1+t[i-1][j-1];
                else
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);

        return t[s1.length()][s2.length()];
    }

    //Using memoization
    public static int lcsUsingRecursion(String s1, String s2, int m, int n, int[][] t) {
        if(m==0||n==0) return 0;
        if(t[m][n]!=-1) return t[m][n];
        if(s1.charAt(m-1)==s2.charAt(n-1)) {
            return t[m][n]= 1 + lcsUsingRecursion(s1,s2,m-1,n-1,t);
        }else{
            return t[m][n] = Math.max(lcsUsingRecursion(s1,s2,m-1,n,t),lcsUsingRecursion(s1,s2,m,n-1,t));
        }
    }

    //Normal recursion without memoization
    public static int lcsUsingRecursion(String s1, String s2, int n, int m) {
        if(n==0||m==0) return 0;
        if(s1.charAt(n-1)==s2.charAt(m-1))
            return 1+lcsUsingRecursion(s1,s2,n-1,m-1);
        else
            return Math.max(lcsUsingRecursion(s1,s2,n-1,m),lcsUsingRecursion(s1,s2,n,m-1));
    }
}
