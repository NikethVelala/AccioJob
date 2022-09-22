import java.util.Scanner;

public class AndOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(n & m);
        }
    }
}
