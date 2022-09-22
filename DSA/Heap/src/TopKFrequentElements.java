//https://leetcode.com/problems/top-k-frequent-elements/
import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int k=sc.nextInt();
        int[] a1 = topKFrequent(a, k);
        for(int i:a1) System.out.print(i+" ");
    }

    public static int[] topKFrequent(int[] a, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:a) map.put(i,map.getOrDefault(i,0)+1);
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((x,y)->(y.getValue()-x.getValue()));
        for(Map.Entry<Integer,Integer> pq1:map.entrySet())
            pq.add(pq1);
        int[] ret = new int[k];
        for(int i=0;i<k;i++)
            ret[i] = pq.poll().getKey();
        return ret;
    }
}
