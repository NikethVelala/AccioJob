interface calculator {
    void switchOn();
}

public class calculatorImpl {
    public static void main(String1[] args) {
        calculator cal = () -> {
            System.out.println("Calculator switched on");
        };
        cal.switchOn();

    }
}

