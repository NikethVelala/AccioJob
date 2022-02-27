import java.util.Scanner;

//Count of odd numbers in an array

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take no of inputs
        int n=sc.nextInt();
        int[] a=new int[n];
        int i=0;
        //take inputs into an array
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        /*--------------------------------*/
        //Main code
        //a=[1,2,3,4];
        int sum=0;
        for(i=0;i<n;i++){
            if(a[i]%2==1){
                sum=sum+a[i];   // sum*=a[i];
            }
        }
        System.out.println("Count of odd numbers are : "+ sum);
    }
}
