import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java_8 {
    public static void main(String1[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);
        list.add(3);list.add(4);

        list.forEach(x -> System.out.print(x + " "));
        System.out.println();

        list.forEach(System.out::print);
        System.out.println();

        list.parallelStream().forEach(x -> System.out.print(x + " "));
        System.out.println();

        list.stream().map(x -> x * 2).forEach(x -> System.out.print(x + " "));

        Stream<Integer> s = list.stream();
        System.out.println();

        System.out.println(list.stream().map(x -> x * 2).reduce(0, (c, e) -> c + e));

        Optional<Integer> reduce1 = list.stream().reduce((c, e) -> c > e?e:c);
        Optional<Integer> reduce2 = list.stream().reduce((c,e) -> c+e);
        System.out.println(reduce1.get());
        System.out.println(reduce2.get());

        List<Integer> l = Arrays.asList(5, 22, 25, 11, 15);
        System.out.println(l.stream().filter(x -> x % 5 == 0).reduce(0, Integer::sum));

        System.out.println(l.stream()
                .filter(x -> x % 5 == 0)
                .map(x -> x * 2)
                .reduce(0, (c, e) -> c + e));

        int result = l.stream().max(Integer::compare).orElse(0);
        System.out.println(result);

        Set<Integer> set = l.stream().map(x -> x * 2).collect(Collectors.toSet());
        System.out.println(set);

        List<Integer> list2 = l.stream().sorted().toList();
        System.out.println(list2);
    }
}
