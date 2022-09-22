import java.util.*;

public class TestClass {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      List<List<Integer>> allLocations =  new ArrayList<>();
      for(int i=0;i<n;i++){
          List<Integer> list=new ArrayList<>();
          for(int j=0;j<2;j++)  list.add(sc.nextInt());
          allLocations.add(list);
      }
      int k=sc.nextInt();
        System.out.print(deliveryPlan(allLocations,k));
    }

    private static List<List<Integer>> deliveryPlan(List<List<Integer>> allLocations, int numDeliveries) {
        HashMap<Double,List> map = new HashMap<>();
        List<List<Integer>> retList =new ArrayList<>();
        if(numDeliveries==0){
            retList.add(new ArrayList<>());
            return retList;
        }
        for(List<Integer> list:allLocations){
            int sum=list.get(0)*list.get(0)+list.get(1)*list.get(1);
            double sqrt = Math.sqrt(sum);
            if(map.containsKey(sqrt)) map.get(sqrt).add(list);
            else map.put(sqrt,list);
        }
        ArrayList<Double> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        for(double d:keyList) {
            if(numDeliveries==0) break;
            numDeliveries--;
            retList.add(map.get(d));
        }
        return retList;
    }
}
