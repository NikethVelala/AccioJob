import java.util.ArrayList;
import java.util.List;

public class sample1 {
    public static void main(String[] args) {
        List<String> list   =new ArrayList<>();
        list.add("java 6");
        list.add("java 7");
        list.add("java 8");

        System.out.println(list.stream().allMatch(s->{
            System.out.println("nik "+ s);
            return s.contains("8");
        }));
    }
}
