import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String args[]) {
        /*Practice p = new Practice();
        String s="120";
        int n=Integer.parseInt(s)+10;
        System.out.println(n);*/

        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);
        System.out.println(list.stream().map(x->x*1).reduce(0,(c,e)->c+e));
    }
}