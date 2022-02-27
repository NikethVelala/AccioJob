import java.util.ArrayList;
import java.util.Scanner;

public class StockSpanProblem {
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
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++) a.add(sc.nextInt());
        int[] b=stockSpanProblem(a,n);
        for(int i:b) System.out.print(i+" ");
    }

    public static int[] stockSpanProblem(ArrayList<Integer> a, int n) {
        int[] b=new int[n];
        int index=0;
        for(int i: a){
            if(top==null){push(i);b[index++]=1;}
            else{
                while(peek()<i)
                    pop();
                if(peek()==-1){
                    b[index]=index++ + 1; push(i);}
                else
                {b[index]=index++-a.indexOf(peek());push(i);}
            }
        }
        return b;
    }
}