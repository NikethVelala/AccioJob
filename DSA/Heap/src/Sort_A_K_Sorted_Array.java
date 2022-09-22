import java.util.PriorityQueue;
import java.util.Scanner;

public class Sort_A_K_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int k=sc.nextInt();
        a = sortK(a,k);
        for(int i:a)  System.out.print(i+" ");
    }

    private static int[] sortK(int[] a, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int j=0;
        for(int i=0;i<a.length;i++){
            pq.add(a[i]);
            if(i>=k) a[j++] = pq.poll();
        }
        while(!pq.isEmpty()) a[j++] = pq.poll();
        return a;
    }
}
