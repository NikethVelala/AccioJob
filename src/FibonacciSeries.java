public class FibonacciSeries {
    public static void main(String[] args) {
        int x = 0, y = 1, next ;
        int n = 10;
        System.out.println(x);
        System.out.println(y);
        for (int i = 1; i < n; i++) {
            next = x+y;
            x=y;
            y=next;
            System.out.println(next);
        }
    }
}
