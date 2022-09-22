//https://www.youtube.com/watch?v=xvXbvrUUGMM
class Hi1 implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class Hello1 implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        /*Hi1 obj1 = new Hi1();
        Hello1 obj2 = new Hello1();*/
        //or
        Runnable obj1 = new Hi1();
        Runnable obj2 = new Hello1();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        t2.start();

    }
}
