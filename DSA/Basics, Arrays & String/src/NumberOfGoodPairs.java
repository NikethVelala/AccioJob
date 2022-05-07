import java.util.HashMap;
import java.util.Scanner;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int key=sc.nextInt();
            if(map.containsKey(key)) map.put(key,map.get(key)+1);
            else map.put(key,1);
        }
        int count=0;
        for(int i:map.values())
            if(i>1)
                count+=(i*(i-1))/2;
        System.out.println(count);
    }
}
