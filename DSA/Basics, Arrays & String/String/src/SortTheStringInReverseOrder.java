import java.util.Arrays;

public class SortTheStringInReverseOrder {
    public static void main(String[] args) {
        String s="geeks";
        //Approach 1
        System.out.println(ReverseSort(s));
        //Approach 2
        System.out.println(ReverseSort1(s));
    }

    public static String ReverseSort(String str) {
        int[] charCount = new int[26];
        for(int i=0;i<str.length();i++)
            charCount[str.charAt(i)-'a']++;
        str="";
        for(int i=25;i>=0;i--){
            for(int j=0;j<charCount[i];j++)
                str+=(char)('a'+i);
        }
        return str;
    }


    public static String ReverseSort1(String str) {
        char[] s = str.toCharArray();
        Arrays.sort(s);
        int n=s.length;

        for(int i=0;i<n/2;i++){
            char t;
            t=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=t;
        }
        return String.valueOf(s);
    }
}
