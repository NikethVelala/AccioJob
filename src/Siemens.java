import java.util.Scanner;

public class Siemens {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int[] x=new int[b];
            int total=a,t;
            if(a%b==0) t=a/b;
            else t=a/b+1;
            for(int j=0;j<b;j++){
                x[j]= Math.min(total, t);
                total-=t;
            }
            int sum=0;
            for(int u=0;u<b;u++){
                for(int v=u+1;v<b;v++){
                    sum+=x[u]*x[v];
                }
            }
            System.out.println(sum);
        }
    }
}
