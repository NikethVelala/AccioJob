import java.util.*;

public class interview {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int k=sc.nextInt();
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(a[i]==k)
                System.out.println(a[i]);
            if(sum==k) {
                for (int j = 0; j <= i; j++)
                    System.out.print(a[j] + " ");
                System.out.println();
            }
            else if(map.containsKey(sum-k)){
                List<Integer> arr=map.get(sum-k);
                for(int j: arr) {
                    for (int t = j + 1; t <= i; t++)
                        System.out.print(a[t]+" ");
                }
                System.out.println();
            }
            if(!map.containsKey(sum)) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(sum, list);
            }else{
                List<Integer> list = map.get(sum);
                list.add(i);
                map.put(sum,list);
            }
        }
    }
}
