import java.util.HashMap;

public class TestClass {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map1= new HashMap<>();
        map1.put(1,1);
        map1.put(2,2);
        map1.put(3,3);
        map1.put(4,4);
        HashMap<Integer,Integer> map2=new HashMap<>(map1);
        map2.put(1,2);
        System.out.println(map1);
        System.out.println(map2);
    }
}
