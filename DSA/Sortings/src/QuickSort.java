import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        quickSort(a,0,n-1);
        for(int i:a) System.out.print(i+" ");
    }

    private static void quickSort(int[] a, int l, int h) {
        if(l<h){
            int pi=partition(a,l,h);
            quickSort(a,l,pi-1);
            quickSort(a,pi+1,h);
        }
    }

    private static int partition(int[] a, int l, int h) {
        int pivot = a[h],i=l-1,temp;
        for(int j=l;j<h;j++){
            if(a[j]<=pivot){
                i++;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        temp=a[h];
        a[h]=a[i+1];
        a[i+1]=temp;
        return i+1;
    }
}
