import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MaximumAreaHistogram {
    static class Node{
        int val;
        Node next=null;
        Node(int val){
            this.val=val;
        }
    }
    static Node top=null;
    static void push(int val){
        Node newNode=new Node(val);
        if(top==null) top=newNode;
        else{
            newNode.next=top;
            top=newNode;
        }
    }
    static int peek(){
        if(top==null) return -1;
        else
            return top.val;
    }
    static void pop(){
        top=top.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) a[i]=sc.nextInt();
        System.out.println(MAH(a,n));
    }

    public static int MAH(int[] a,int n){
        int[] left=leftSmallBuilding(a,n);
        top=null;
        int[] right=rightSmallBuilding(a,n);
        int max=0;
        for(int i=0;i<n;i++)
            max=Math.max(max,a[i]*(right[i]-left[i]-1));
        return max;
    }
    private static int[] rightSmallBuilding(int[] a, int n) {
        int[] right=new int[n];
        for(int i=n-1;i>-1;i--){
            if(top==null){ right[i]=n;push(i); }
            else{
                while(a[peek()]>=a[i]){
                    pop();
                    if(peek()==-1) break;
                }
                if(peek()==-1) right[i]=n;
                else right[i]=peek();
                push(i);
            }
        }
        return right;
    }
    private static int[] leftSmallBuilding(int[] a,int n) {
        int[] left=new int[n];
        for(int i=0;i<n;i++){
            if(top==null){ left[i]=-1;push(i); }
            else{
                while(a[peek()]>=a[i]){
                    pop();
                    if(peek()==-1) break;
                }
                if(peek()==-1) left[i]=-1;
                else left[i]=peek();
                push(i);
            }
        }
        return left;
    }
}