import java.util.ArrayList;
import java.util.Arrays;

@FunctionalInterface
interface Musti_Papa{
    int jaffa(int str);
}

public class methodReference {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(-1,2,-3));

        a.stream().map(Math::abs).forEach(System.out::println);
    }
}
