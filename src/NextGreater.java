import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {

    }

    public int[] nextGreater(int[] a) {
        int n = a.length;
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty()&&stack.peek() <= a[i]) stack.pop();
            if (stack.isEmpty()) right[i] = -1;
            else right[i] = stack.peek();
            stack.push(a[i]);
        }
        return right;
    }
}
