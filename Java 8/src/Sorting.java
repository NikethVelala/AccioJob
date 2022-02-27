import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(30,10,20);
        list.stream().sorted().forEach(x-> System.out.print(x+" "));
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(x-> System.out.print(x+" "));

    }
}
