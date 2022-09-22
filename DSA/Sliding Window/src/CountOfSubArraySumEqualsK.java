/*
important problem
https://leetcode.com/problems/subarray-sum-equals-k/
https://www.youtube.com/watch?v=HbbYPQc-Oo4&t=617s
*/
import java.util.*;
public class CountOfSubArraySumEqualsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(subarraySum(a, k));
    }

    private static int subarraySum(int[] a, int k) {
        int prefix = 0, count = 0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < a.length; i++) {
            prefix += a[i];
            if(map.containsKey(prefix-k))
                count+=map.get(prefix-k);
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}
