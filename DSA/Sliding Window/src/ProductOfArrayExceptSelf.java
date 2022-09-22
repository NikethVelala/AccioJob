//https://www.youtube.com/watch?v=bNvIQI2wAjk

import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i : productExceptSelf(a))
            System.out.print(i + " ");
    }

    // without storing value for prefix and suffix arrays
    private static int[] productExceptSelf(int[] nums) {
        int[] a = new int[nums.length];
        int temp = 1;
        for (int i = 0; i < nums.length; i++) {
            a[i] = temp;
            temp = temp * nums[i];
        }
        temp = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            a[i] = a[i] * temp;
            temp = temp * nums[i];
        }
        return a;
    }

    //Storing value for prefix and suffix arrays
    private static int[] productExceptSelf1(int[] nums) {
        int[] a = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int temp = 1;
        for (int i = 0; i < nums.length; i++) {
            prefix[i] = temp;
            temp = temp * nums[i];
        }
        temp = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            suffix[i] = temp;
            temp = temp * nums[i];
        }
        for (int i = 0; i < nums.length; i++)
            a[i] = suffix[i] * prefix[i];
        return a;
    }
}
