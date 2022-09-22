import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/check-if-two-strings-are-k-anagrams-or-not/1
public class CheckIfTwoStringsAreKAnagramsOrNot {
    public static void main(String[] args) {
        String s1="wurkbxkgkfmlzofn",s2="mczujslxzvhecrpy";
        System.out.println(areKAnagrams(s1,s2,10));
    }

    public static boolean areKAnagrams(String s1, String s2, int k) {
        if(s1.length()!=s2.length()) return false;
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<s1.length();i++)
            if(c1[i]!=c2[i]){
                k--;
                if(k<0) return false;
            }
        return true;
    }
}
