// https://practice.geeksforgeeks.org/problems/count-the-triplets4615/1#
import java.util.*;
public class CountTheTriplets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(countTriplet(a,n));
    }

    static int countTriplet(int arr[], int n) {
        Arrays.sort(arr);
        int count = 0;
        for(int i=0;i<n;i++){
            int target = arr[i];
            int s = 0,  e = n-1;
            while(s<e) {
                if(arr[s]+arr[e] == target){
                    count++;s++;e--;
                }
                else if(arr[s]+arr[e] > target)e--;
                else s++;
            }
        }
        return count;
    }
}
