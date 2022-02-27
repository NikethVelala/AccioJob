import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30);
        Predicate<Integer> predicate=t->t%2==0;
        list.stream().filter(predicate).forEach(t-> System.out.print(t+" "));
        //can also be written as
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));

    }
}
