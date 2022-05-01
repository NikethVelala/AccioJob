import java.util.HashSet;

public class RotateArray {

    public static void main(String[] args) {
        int[] a = {-1,-100,3,99};
        rotate(a, 2);
        for (int i : a)
            System.out.print(i + " ");
    }

    public static void rotate(int[] nums, int k) {
        if(k==0) return;
        int[] temp = new int[nums.length];
        int j = 0;
        for (int i = nums.length - k; i < nums.length; i++)
            temp[j++] = nums[i];
        k=k%2==1?k+1:k;
        for (int i = 0; i <k; i++)
            temp[j++] = nums[i];
        for (int i = 0; i < nums.length; i++)
            nums[i] = temp[i];
    }
}
