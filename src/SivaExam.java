import java.util.*;

public class SivaExam {
    public static void main(String[] args) {
        int[] myArray = new int[]{2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        List<Integer> array = new ArrayList<>();
        array.add(5);array.add(2);array.add(3);array.add(4);
        Optional<Integer> reduce1 = array.stream().reduce((c, e) -> c > e?e:c);
        Optional<Integer> reduce2 = array.stream().reduce((c,e) -> c+e);
        System.out.println(reduce1.get());
        System.out.println(reduce2.get());
    }
}
