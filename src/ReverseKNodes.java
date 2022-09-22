import java.util.*;

public class ReverseKNodes {
    public static void main(String[] args) {
    }

   public List<List<Integer>> threeSum(int[] a){
       Arrays.sort(a);
       List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(i>0&&a[i]==a[i-1]) continue;
            int j=i+1,k=a.length-1;
            int target=-a[i];
            while(j<k){
                if(target==(a[j]+a[k])){
                    list.add(Arrays.asList(a[i],a[j],a[k]));
                    while(k>j&&a[k]==a[k-1]) k--;
                    while(j<k&&a[j]==a[j+1]) j++;
                }else if(target<(a[j]+a[k])){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return list;
   }
}
