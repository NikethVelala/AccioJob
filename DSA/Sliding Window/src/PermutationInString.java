import java.util.*;
/*  Example
    input: abc bitbace   output: true
    input: abc batac     output: false
*/
public class PermutationInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next(),s2= sc.next();
        System.out.println(permutationInString(s1,s2));
    }

    public static boolean permutationInString(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i=0;i<s1.length();i++){
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr1,arr2)) return true;
        int front=0, back=s1.length();
        while(back<s2.length()){
            arr2[s2.charAt(back)-'a']++;
            arr2[s2.charAt(front)-'a']--;
            if(Arrays.equals(arr1,arr2)) return true;
             front++;
             back++;
        }
        return false;
    }
}
