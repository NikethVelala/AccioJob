import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30);

        Consumer<Integer> consumer=t->System.out.print(t + " ");
        list.stream().forEach(consumer);
        //instead of above we can write
        list.stream().forEach(t->System.out.print(t + " "));
    }
}
