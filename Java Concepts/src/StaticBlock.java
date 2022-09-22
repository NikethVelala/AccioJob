/*
O/P Reason:
Firstly the static block inside the main-method calling class will be implemented.
Hence ‘b’ will be printed first. Then the main method is called, and now the sequence is kept as expected.
*/

class Scaler {
    static int i;
    static {
        System.out.println("a");
        i = 100;
    }
}

public class StaticBlock {
    static {
        System.out.println("b");
    }
    public static void main(String[] args) {
        System.out.println("c");
        System.out.println(Scaler.i);
    }
}

