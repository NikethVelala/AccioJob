import java.util.Scanner;

public class RemoveAllAdjacentDuplicates {
    public static void main(String1[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(Consecutive(s,0));
    }

    private static String Consecutive(String s, int i) {
        if(s.length()==1||i>=s.length()-1) return s;
        int j=i;
        while(j<s.length()-1&&s.charAt(j)==s.charAt(j+1))
            j++;
        if(j>i)
            return Consecutive(s.substring(0,i)+s.substring(j+1),0);
        else
            return Consecutive(s,i+1);
    }
}
