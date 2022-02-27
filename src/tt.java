import java.util.Arrays;
import java.util.List;

public class tt {
static String a ="hello";
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4);
        System.out.println(list.stream().map(x->x*2).reduce(0,(c,e)->c+e));
    }
}
