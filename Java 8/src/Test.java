//https://www.youtube.com/watch?v=k7fNLXoVCYg&t=901s


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
       /* Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        Runnable run = () -> {};
        Runnable th=() -> System.out.println("run method");
        new Thread(th).start();*/

        //From MyFunction interface
        //When return type of abstract method is void
        /*MyFunction test = (i) -> System.out.println("Test method executed ...");
        test.test(15);*/

        /*//when return type of abstract method is int
        MyFunction function=(i)-> i*10;
        // similar to: MyFunction function=(i)->{ return i;};
        System.out.println(function.test(15));*/

        //When return type is string and takes two parameters
        //MyFunction function  = (s1,s2) ->{return s1+":"+s2;};
        /*MyFunction function = (s1,s2) -> s1+":"+s2;
        System.out.println(function.test("abc", "def"));*/

        //Predefined functional interface example: Function
        //it takes a parameter and gives a result
        //the below method will take integer as input and return String as output
        /*Function<Integer,String> function = (t) -> "Output :"+t;*/
        //or you can do this
        /*Function function = (t) -> "Output :"+t;
        System.out.println(function.apply(88));*/

        //Demonstration of streams
        List<Integer> list= Arrays.asList(23,4,6,8,9,1,2,10);
        //return numbers which are greater than 4 and sort them in ascending order
        /*list.stream().filter(x->x>4).sorted().forEach(System.out::println);*/

        //Demonstration of method reference
        //defined printElement static method outside of main method in this class
        //this is static method reference
        /*list.stream().filter(x->x>4).sorted().forEach(Test::printElement);*/

        // We can define a non-static method and create an object to access it
        //This is instance method refer
        /*Test test=new Test();
        list.stream().filter(x->x>4).sorted().forEach(test::printElement1);*/

        //When to use map and flatMap
        List<User> users = Stream.of(
                new User("user1","1234567890",Arrays.asList("abc@gmail.com","def@gmail.com")),
                new User("user2","0987654321",Arrays.asList("ghi@gmail.com","jkl@gmail.com")))
                .collect(Collectors.toList());

        //Gather all the phone numbers of all the users

        /*List<String> phoneNumbers = users.stream().map(User::getPhone).collect(Collectors.toList());
        System.out.println(phoneNumbers);*/
                                                    //one to many
        /*List<List<String>> lists = users.stream().map(User::getEmail).collect(Collectors.toList());*/
        //Here it will print list of lists, since one user can have many emails (one to many)
        /*System.out.println(lists);*/
        //but we want only one list, we can use flatmap for this
        /*List<String> lists1 = users.stream().flatMap(u->u.getEmail().stream()).collect(Collectors.toList());
        System.out.println(lists1);*/

        /*//Write a program using stream to Find frequency of each character in a given String

        String input="Niketh";

        Map<String, Long> countMap = Arrays.stream(input.split("")).collect(
                Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                )
        );

        System.out.println(countMap);*/


        //Assume you have list of employee in various dept, WAP to find highest paid employee of each dept

        List<Employee> employees = Stream.of(
                new Employee(1,"Niketh","DEV",50000),
                new Employee(2,"Priya","DEV",80000),
                new Employee(3,"Rishi","QA",60000),
                new Employee(4,"Pradeep","QA",90000),
                new Employee(5,"Vandana","DEVOPS",40000)
        ).collect(Collectors.toList());

        Comparator<Employee> compareBySalary = Comparator.comparing(Employee::getSalary);
        Map<String, Optional<Employee>> employeesMap = employees.stream().
                collect(
                        Collectors.groupingBy(Employee::getDept,
                                Collectors.reducing(BinaryOperator.maxBy(compareBySalary)))
                );
        System.out.println(employeesMap);

    }

    // Outside of main method
    // As this is a static method no need to create instance for accessing this method
    public static void printElement(int i){
        System.out.println(i);
    }
    public void printElement1(int i){
        System.out.println(i);
    }

}
