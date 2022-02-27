import java.util.Scanner;

public class NextGreaterElement {
    public static class Node{
        int val;
        Node next=null;
        Node(int val){
            this.val=val;
        }
    }
    public static void push(int val){
        Node newNode=new Node(val);
        if(top==null) top=newNode;
        else {newNode.next=top;top=newNode;}
    }
    public static int pop(){
        if(top==null) return -1;
        else{
            int ret=top.val;
            top=top.next;
            return ret;
        }
    }
    public static int peek(){
        if(top==null) return -1;
        else return top.val;
    }
    public static Node top=null;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int[] b=nextGreaterElement(a,n);
        for(int i:b) System.out.print(i+" ");
    }

    public static int[] nextGreaterElement(int[] a, int n) {
        int[] b=new int[n];
        for(int i=n-1;i>=0;i--){
            if(peek()==-1) {
                b[i]=-1;
                push(a[i]);
            }else{
                while(peek()<a[i]&&peek()!=-1) pop();
                if(top==null){ b[i]=-1; push(a[i]);}
                else{ b[i]=peek(); push(a[i]);}
            }
        }
        return b;
    }
}