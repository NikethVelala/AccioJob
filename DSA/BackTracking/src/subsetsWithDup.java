import java.util.*;

public class subsetsWithDup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(subsets(a));
    }

    private static List<List<Integer>> subsets(int[] a) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(a);
        backtrack(a,ans,new ArrayList<Integer>(),0);
        return ans;
    }

    private static void backtrack(int[] a, List<List<Integer>> ans, ArrayList<Integer> ds, int start) {
        ans.add(new ArrayList<>(ds));

        for(int i=start;i<a.length;i++){
            if(i > start && a[i] == a[i-1]) continue;
            ds.add(a[i]);
            backtrack(a, ans, ds, i + 1);
            ds.remove(ds.size() - 1);
        }
    }
}
