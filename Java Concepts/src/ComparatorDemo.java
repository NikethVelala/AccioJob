import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(4);list.add(3);
        list.add(1);list.add(2);
        //using comparator for sorting in reverse order
        /*Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2) return -1;
                else return 1;
            }
        };*/
        //using lambda function
        Comparator<Integer> com = (o1, o2) -> {
            if(o1>o2) return -1;
            else return 1;
        };
        //sorting in ascending order
        //Collections.sort(list);

        //sorting in descending order
        list.sort(com);

        System.out.print(list);
    }
}
