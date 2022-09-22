//https://practice.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1#


public class SmallestWindowInStringOfAnotherstring {

    public static void main(String[] args) {
        String s="timetopractice",p="toc";
        System.out.println(Minimum_Window(s.toCharArray(), p.toCharArray()));
    }
    public static String Minimum_Window(char[] s, char[] t){
        int m[] = new int[256];
        int ans = Integer.MAX_VALUE, start = 0, count = 0;
        for (int i = 0; i < t.length; i++) {
            if (m[t[i]] == 0)
                count++;
            m[t[i]]++;
        }

        int i = 0,j = 0;
        while (j < s.length){
            m[s[j]]--;
            if (m[s[j]] == 0) count--;
            if (count == 0){
                while (count == 0){
                    if (ans > j - i + 1){
                        ans = Math.min(ans, j - i + 1);
                        start = i;
                    }
                    m[s[i]]++;
                    if (m[s[i]] > 0)
                        count++;
                    i++;
                }
            }
            j++;
        }
        if (ans != Integer.MAX_VALUE) return String.valueOf(s).substring(start, ans+start);
        else return "-1";
    }
}
