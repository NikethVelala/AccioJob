//https://www.youtube.com/watch?v=-fx6aDxcWyg
//Prerequisite for edit distance problem
import java.util.Scanner;

public class MinNoOfInsertionAndDeletion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next(),s2=sc.next();
        System.out.println(minNoOfInsertionAndDeletion(s1,s2));
    }

    public static int minNoOfInsertionAndDeletion(String s1, String s2) {
        //Using LCS for getting common subsequence
        int lcss = lcs(s1,s2,s1.length(),s2.length());
        //Finding number of deletions
        int del = Math.max(s1.length(), s2.length())-lcss;
        //Finding number of insertions
        int ins = Math.min(s1.length(),s2.length())-lcss;
        return del+ins;
    }

    public static int lcs(String s1, String s2, int m, int n) {
        if(m==0||n==0) return 0;
        if(s1.charAt(m-1)==s2.charAt(n-1))
            return 1 + lcs(s1,s2,m-1,n-1);
        else
            return Math.max(lcs(s1,s2,m-1,n),lcs(s1,s2,m,n-1));
    }
}
