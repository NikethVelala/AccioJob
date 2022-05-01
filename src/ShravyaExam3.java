import java.util.Arrays;

public class ShravyaExam3 {
    static boolean isConversionPossible(String s1, String s2, int x) {
        int diff = 0, n = s1.length();
        s1 = sortString(s1);
        s2 = sortString(s2);
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) continue;
            diff = ((int) (s2.charAt(i) - s1.charAt(i)) + 26) % 26;
            if (diff > x) {
                return false;
            }
        }
        return true;
    }

    public static String sortString(String inputString) {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "dddd";
        int x = 3;
        if (isConversionPossible(s1, s2, x))
            System.out.println("YES");
        else System.out.println("NO");
    }
}

