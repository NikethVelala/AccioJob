import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8Test {
    public static void main(String[] args) {
        String[] s=new String[]{"2","1","6","4","5"};
        List<String> s1= new ArrayList<>(Arrays.asList(s));
        List<Integer> collect = s1.stream().map(Integer::parseInt).sorted().toList();
        for(int i:collect) System.out.print(i+" ");

    }
}
