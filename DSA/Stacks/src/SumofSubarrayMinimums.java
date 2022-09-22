//Leet code problem (watch video)   https://www.youtube.com/watch?v=9-TXIVEXX2w&t=439s
//important problem

import java.util.*;

public class SumofSubarrayMinimums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.println(sumOfSubarrayMinimums(a));
    }

    public static int sumOfSubarrayMinimums(int[] a) {
        int n = a.length, sum = 0;
        int[] r = new int[a.length];
        int[] l = new int[a.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (stack.empty())
                l[i] = i;
            else {
                while (!stack.empty() && a[stack.peek()] >= a[i]) stack.pop();
                if (stack.empty()) l[i] = i;
                else l[i] = i - stack.peek() - 1;
            }
            stack.push(i);
        }
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            if (stack.empty())
                r[i] = n - i - 1;
            else {
                while (!stack.empty() && a[stack.peek()] > a[i]) stack.pop();
                if (stack.empty()) r[i] = n - i - 1;
                else r[i] = stack.peek() - i - 1;
            }
            stack.push(i);
        }
        for (int i = 0; i < n; i++)
            sum += (l[i] + 1) * a[i] * (r[i] + 1);

        return sum;
    }
}
