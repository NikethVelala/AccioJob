//Initial Template for Java

import java.io.*;
import java.util.*;

public class CountPairsOfSumK {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class solution {
    int getPairsCount(int[] a, int n, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++)
            if(a[i]<=k){
                if(map.containsKey(k-a[i])){
                    map.put(k-a[i],map.get(k-a[i])+1);
                    count+=map.get(k-a[i]);
                }
                map.put(a[i],1);
            }
        return count/2;
    }
}
