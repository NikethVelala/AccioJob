//https://practice.geeksforgeeks.org/problems/edit-distance3702/1
//https://www.youtube.com/watch?v=AuYujVj646Q
import java.util.Scanner;

public class EditDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(editDistance(s, t, s.length(),t.length()));
        System.out.println(usingDP(s,t,s.length(),t.length()));
    }

    //Normal recursion (back tracking)
    public static int editDistance(String s, String t, int m, int n) {
        if(m==0) return n;
        if(n==0) return m;
        if(s.charAt(m-1)==t.charAt(n-1)) return editDistance(s,t,m-1,n-1);
        return 1 + Math.min(Math.min(editDistance(s,t,m,n-1),editDistance(s,t,m-1,n)),editDistance(s,t,m-1,n-1));
    }

    //DP
    public static int usingDP(String s, String t, int m, int n) {
        int[][] t1=new int[m+1][n+1];
        for(int i=0;i<m+1;i++) t1[i][0] = i;
        for(int j=0;j<n+1;j++) t1[0][j] = j;

        for(int i=1;i<m+1;i++)
            for(int j=1;j<n+1;j++)
                if(s.charAt(i-1)==t.charAt(j-1)) t1[i][j] = t1[i-1][j-1];
                else t1[i][j] = 1 + Math.min(Math.min(t1[i][j-1],t1[i-1][j]),t1[i-1][j-1]);

        return t1[m][n];
    }
}
