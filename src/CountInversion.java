import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CountInversion {
    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),j=0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
            map.put(a[i],i);
        Arrays.sort(a);
        int count=0;
        while(j<n){
            if(j!=map.get(a[j])){
                int temp=a[j],index=map.get(a[j]);
                a[j]=a[index];
                a[index]=temp;
                count++;
            }else j++;
        }
        System.out.println(count);
    }
}
