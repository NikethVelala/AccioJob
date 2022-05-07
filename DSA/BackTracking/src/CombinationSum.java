//https://www.youtube.com/watch?v=OyZFFqQtu98
import java.util.*;
public class CombinationSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int target=sc.nextInt();
        List<List<Integer>> lists= combinationSum(a,target);
        System.out.println(lists);
    }

    public static  List<List<Integer>> combinationSum(int[] a, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        findCombinations(0,a,target,ans,new ArrayList<>());
        return ans;
    }

    private static void findCombinations(int index, int[] a, int target, List<List<Integer>> ans, List<Integer> ds) {
        if(index==a.length){
            if(target==0)
                ans.add(new ArrayList<>(ds));
            return;
        }
        if(a[index]<=target){
            ds.add(a[index]);
            findCombinations(index,a,target-a[index],ans,ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(index+1,a,target,ans,ds);
    }
}
