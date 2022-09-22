import java.util.*;
public class AsteroidCollison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int b[]=asteroidCollison(a);
        for(int i:b)
            System.out.print(i+" ");
    }

    public static int[] asteroidCollison(int[] a) {
        LinkedList<Integer> s = new LinkedList<>(); // use LinkedList to simulate stack so that we don't need to reverse at end.
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 || s.isEmpty() || s.getLast() < 0)
                s.add(a[i]);
            else if (s.getLast() <= -a[i])
                if (s.pollLast() < -a[i]) i--;
        }
        return s.stream().mapToInt(i->i).toArray();
    }
}
