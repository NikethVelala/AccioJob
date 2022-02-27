import java.util.*;

class findfactorial{
    public int findingfactorial(int x){
        if(x==1) return x;
        return x*findingfactorial(x-1);
    }
}

public class factorial {
    public static void main(String1[] args) {
        Scanner sc=new Scanner(System.in);
        findfactorial f=new findfactorial();
        int n=sc.nextInt();
        int t=f.findingfactorial(n);
        System.out.println(t);
    }
}