import java.util.Scanner;

public class RecursivelyRemoveAllAdjacentDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(remove(s));
    }

    private static String remove(String s) {
        int i=0;
        while(i<s.length()-1){
            if(s.charAt(i)==s.charAt(i+1)){
                String t=s.substring(i).length()>2?s.substring(i+2):"";
                s = remove(s.substring(0,i) + t);
                i=0;
            }else i++;
        }
        return s;
    }
}
