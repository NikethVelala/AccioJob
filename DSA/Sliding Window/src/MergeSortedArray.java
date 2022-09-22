import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums1=new int[m];
        for(int i=0;i<m;i++) nums1[i]=sc.nextInt();
        int n = sc.nextInt();
        int[] nums2=new int[n];
        for(int i=0;i<n;i++) nums2[i]=sc.nextInt();
        merge(nums1,m,nums2,n);
        for(int i:nums1)
            System.out.print(i+" ");

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j])
                nums1[k--]=nums1[i--];
            else
                nums1[k--]=nums2[j--];
        }

        while(i>=0) nums1[k--]=nums1[i--];
        while(j>=0) nums1[k--]=nums2[j--];
    }
}
