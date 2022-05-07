import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(permute(a));
    }

    private static List<List<Integer>> permute(int[] a) {
        List<List<Integer>> ans =new ArrayList<>();
        permutations(a,ans,new ArrayList<Integer>());
        return ans;
    }

    private static void permutations(int[] a, List<List<Integer>> ans, ArrayList<Integer> ds) {
        if(ds.size()==a.length)
            ans.add(new ArrayList<>(ds));
        for(int i=0;i<a.length;i++){
            if(ds.contains(a[i])) continue;
            ds.add(a[i]);
            permutations(a,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}
