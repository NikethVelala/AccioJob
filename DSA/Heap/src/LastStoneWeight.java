import java.util.*;

public class LastStoneWeight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++) pq.add(a[i]);
        int first,second;
        while(n>1){
            first = pq.poll();
            second = pq.poll();
            n-=2;
            int t = first-second;
            if(t>0) {
                pq.add(t);
                n+=1;
            }
        }
        if(n==1) System.out.println(pq.poll());
        else System.out.println("bongu");
    }
}
