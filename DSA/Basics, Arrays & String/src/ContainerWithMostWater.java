//https://www.youtube.com/watch?v=UuiTKBwPgAo
import java.util.Scanner;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(containerWithMostWater(a));
    }

    //Greedy approach O(n^2)
    /*private static int containerWithMostWater(int[] height) {
        int res=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int area = (j-i)*Math.min(height[j],height[i]);
                res=Math.max(res,area);
            }
        }
        return res;
    }*/

    //Two pointer approach O(n)
    private static int containerWithMostWater(int[] height){
        int l=0,r=height.length-1,res=0;
        while(l<r){
            int area=(r-l)*Math.min(height[l],height[r]);
            res=Math.max(res,area);
            if(height[l]<height[r]) l++;
            else r--;
        }

        return res;
    }

}
