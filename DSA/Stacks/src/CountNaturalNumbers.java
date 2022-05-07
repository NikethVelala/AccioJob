import java.util.Scanner;
import java.util.Stack;

//CountNaturalNumbersWhoseAllPermutationsAreGreaterThanThatNumber
public class CountNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countNos(n));
    }

    public static int countNos(int n) {
        Stack<Integer> stack = new Stack<>();
        int count=0;
        for(int i=1;i<=n;i++){
            int j=i;
            boolean flag=true;
            stack.push(j%10);
            j=j/10;
            while(j!=0){
                if(stack.peek()>=j%10)
                    stack.push(j%10);
                else { flag=false; break;}
                j/=10;
            }
            stack.clear();
            if(flag)
                count++;
        }
        return count;
    }
}
