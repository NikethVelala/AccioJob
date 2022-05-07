import java.util.*;
/*
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
*/

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),p= sc.next();
        List<Integer> anagrams = findAnagrams(s, p);
        for(int i:anagrams)
            System.out.print(i+" ");
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(int i=0;i<p.length();i++){
            arr1[p.charAt(i)-'a']++;
            arr2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr1,arr2)) list.add(0);
        int front=0,back=p.length();
        while(back<s.length()){
            arr2[s.charAt(back++)-'a']++;
            arr2[s.charAt(front++)-'a']--;
            if(Arrays.equals(arr1,arr2)) list.add(front);
        }
        return list;
    }
}
