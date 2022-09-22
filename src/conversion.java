public class conversion {
    public static void main(String[] args) {
        isConversionPossible("abc","ddd",3);
    }

    static void isConversionPossible(String s1, String s2, int x) {
        int diff = 0, n;
        n = s1.length();

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i))
                continue;

            diff = ((s2.charAt(i) - s1.charAt(i)) + 26) % 26;

            if (diff > x) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}


