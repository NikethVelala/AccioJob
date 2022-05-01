import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        /*for(int i:a){
            i=i*i;
            System.out.print(i+" ");
        }*/
        //a.stream().map(x->x*x).forEach(y-> System.out.print(y+" "));
        List<Integer> list = a.stream().map(x -> x * x).collect(Collectors.toList());
        List<Integer> list1 = a.stream().map(x -> x * x).toList();
        for(int i:list) System.out.print(i+" ");

        /*AtomicInteger a1=new AtomicInteger(10);
        HashMap<Integer,Integer> map1=new HashMap<>();
        a.stream().map(i -> {
            a1.getAndAdd(15);
            System.out.println(a1);
            return map1.put(i,i*i);
        }).toList();
        for(int i:map1.keySet())
            System.out.println(i+" "+map1.get(i));*/

        /* a.forEach(System.out::print);*/

        /* a.parallelStream().forEach(x-> System.out.println(x+" ")); */

        /* System.out.println(a.stream().reduce(0,(c,e)->c+e));*/
        System.out.println();
         System.out.println(a.stream().filter(x->x%2==0).reduce(0,Integer::sum));


        List<Integer> l = Arrays.asList(5, 22, 25, 32, 15);

        /*System.out.println(l.stream()
                .filter(x->x%5==0)
                .map(x->x*x)
                .reduce(0,(c,e)->c+e));*/

        //System.out.println(l.stream().filter(x->x%10==0).max(Integer::compare).orElse(100000));

        // System.out.println(l.stream().sorted().toList());
    }
}