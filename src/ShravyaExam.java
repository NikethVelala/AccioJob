import java.util.*;

public class ShravyaExam{
    static int largestArea(int arr1[], int n,int arr2[], int m) {
        int end = 0, start = 0, i = 0, j = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                if (start == 0) start = arr1[i];
                else end = arr1[i];
                i++;
                j++;
            }
            else if (arr1[i] > arr2[j]) j++;
            else i++;
        }
        if (end == 0 || start == 0) return 0;
        else return (end - start);
    }
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       for(int j=0;j<t;j++){
        int n=sc.nextInt(),m=sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for(int i=0;i<n;i++) arr1[i]=sc.nextInt();
        for(int i=0;i<m;i++) arr2[i]=sc.nextInt();
        System.out.println(largestArea(arr1, n, arr2, m));
        }
    }
}
