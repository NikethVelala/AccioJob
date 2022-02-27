import java.util.ArrayList;
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>-1) {
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(solve(n, s));
            t--;
        }
    }

    static ArrayList<String> list=new ArrayList<>();
    private static int solve(int n, String s) {
        int count=1,count1=1;
        char prev=s.charAt(0);
        boolean flag=true;
        for(int i=1;i<n;i++) {
            if(flag) {
                if (prev == s.charAt(i)) count1++;
                else{
                    flag=false;
                    count*= Math.max(count1, 1);
                    count1=0;
                }
            }
            if(!flag){
                prev=s.charAt(i);
                count1++;
                flag=true;
            }
        }
        count*=count1>1?count1:1;
        return count;
    }
}
