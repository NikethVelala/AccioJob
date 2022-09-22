//https://www.youtube.com/watch?v=VDYSgjPxu18

//Go and see RunnableExample program and come here
public class RunnableUsingJava8 {
    public static void main(String[] args) {
        //Using anonymous class
        /*Runnable obj1 = new Runnable(){
            public void run(){
                for(int i=0;i<=5;i++){
                    System.out.println("Hello");
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }
            }
        };
        Runnable obj2 = new Runnable(){
            public void run(){
                for(int i=0;i<=5;i++){
                    System.out.println("Hello");
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }
            }
        };*/

        //Using Lambda expression
        Runnable obj1 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        //As we are just keeping obj1 and obj2 in the threads, we can just pass the lambda expression there
        Thread t3 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });

        t3.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        t4.start();

    }
}
