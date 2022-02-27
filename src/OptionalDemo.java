import java.util.Optional;
import java.util.stream.Stream;

class optionalDemoClass{
    public int id;
    public String name;
    public String email;

    public optionalDemoClass(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
public class OptionalDemo {
    public static void main(String[] args) {

        optionalDemoClass demo=new optionalDemoClass(1,"Niketh","velalaniketh@gmail.com");
        optionalDemoClass demo1=new optionalDemoClass(1,"Niketh",null);
  Optional<Object> emptyOptional= Optional.empty();
        System.out.println(emptyOptional);

        System.out.println(Optional.ofNullable(demo.email));
        System.out.println(Optional.ofNullable(demo1.email));


        Optional<String> email=Optional.ofNullable(demo.email);
        Optional<String> email1=Optional.ofNullable(demo1.email);

        // we will get NoSuchElementException for below print statement
        //System.out.println(email.get());

        //therefore we use isPresent(), as it is null we don't get any output
        email1.ifPresent(System.out::println); //alternate for if(email.ispresent()) sout(email.get());
        System.out.println(email);
        email.ifPresent(System.out::print);
        System.out.println(email1.orElse("velalaniketh2@gmail.com"));

        Stream<optionalDemoClass> l = Stream.of(demo,demo1);
    }
}
