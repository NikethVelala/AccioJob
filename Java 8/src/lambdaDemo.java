import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class lambdaDemo  {
    public static void main(String[] args) {
        ArrayList<Integer> a =new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Predicate<Integer> predicate= t->t%2==0;
        System.out.println(a.stream().filter(predicate).reduce(0,Integer::sum));
        FunctionInterfaceExample object = (x,y) -> x+y+4;

    }
}
