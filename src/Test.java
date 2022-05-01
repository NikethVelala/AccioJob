import java.util.*;

class A{
    public final int king;
    public A(){
        king=10;
        System.out.println("Hello Moto 1");
        System.out.println("Hello Moto 2");
    }
}

class B extends A{
    public B(){
        System.out.println("Halo Moto " );
    }
}

public class Test {
    public static void main(String[] args) {
        B a=new B();
    }
}
