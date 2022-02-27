import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Hi","I'm","Niketh");
        List<String> list1= Arrays.asList();
        Supplier<String> supplier=()-> "nothing present";
        System.out.println(list.stream().findAny().orElseGet(supplier));
        System.out.println(list1.stream().findAny().orElseGet(()-> "nothing present"));
    }
}
