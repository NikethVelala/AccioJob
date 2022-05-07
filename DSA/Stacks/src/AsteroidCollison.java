import java.util.Scanner;
import java.util.Stack;

public class AsteroidCollison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int b[]=asteroidCollison(a);
        for(int i:b)
            System.out.print(i+" ");
    }

    public static int[] asteroidCollison(int[] a) {
        Stack<Integer> stack=new Stack<>();
        for (int j : a) {
            if (!stack.isEmpty()) {
                if (j < 0) {
                    while (!stack.isEmpty() &&stack.peek()>0&& stack.peek() < Math.abs(j))
                        stack.pop();
                    if (!stack.isEmpty()) {
                        if (stack.peek() == Math.abs(j)) stack.pop();
                    }else {
                        stack.push(j);
                    }
                }else {
                    stack.push(j);
                }
            } else {
                stack.push(j);
            }
        }
        int b[]=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--)
            b[i]=stack.pop();
        return b;
    }
}
