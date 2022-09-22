/*
import java.util.*;

public class TestClass1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<List<String>> entries =  new ArrayList<>();
        for(int i=0;i<n;i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < 3; j++)
                list.add(sc.next());
            entries.add(list);

        }
        System.out.println(getItems(entries));
    }

    private static List<String> getItems(List<List<String>> entries) {
        List<String> list=new ArrayList<>();
        HashMap<Integer,String> items=new HashMap<>();
        int count=0;
        ArrayList<Integer> keyList = new ArrayList<>();
        for(List<String> l:entries){
            if(l.get(0).equalsIgnoreCase("insert")){
                items.put(Integer.valueOf(l.get(2)),l.get(1));
                keyList = new ArrayList<>(items.keySet());
                Collections.sort(keyList);
            }
            else{
                count++;
                for(int i=1;i<=count;i++)
                    if(items.get(i))
                list.add(items.get(keyList.get(count++)));
            }
        }
        return list;
    }
}
*/
