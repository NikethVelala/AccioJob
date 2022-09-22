import java.util.*;

public class KthLargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int k=sc.nextInt();
        //List al = Arrays.asList(a);
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        //PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++) pq.add(a[i]);
        for(int i=0;i<k-1;i++) pq.poll();
        System.out.println(pq.poll());
    }
}
