//4
import java.util.*;
public class MaxAreaRectBinMatrix {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    static Node top=null;
    static void push(int data){
        Node newNode=new Node(data);
        if(top==null) top=newNode;
        else{
            newNode.next=top;
            top=newNode;
        }
    }
    static int pop(){
        if(top==null) return -1;
        else{  int ret=top.val; top=top.next; return ret;}
    }
    static int peek(){
        if(top==null) return -1;
        else return top.val;
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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++) {
                a[i][j] = sc.nextInt();
                if(i!=0&&a[i][j]!=0) a[i][j]+=a[i-1][j];
            }
        int[] b=new int[m];
        int max=0;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++)
                b[j] = a[i][j];
            max = Math.max(max, MAH(b, m));
        }
        System.out.println(max);
    }
}
