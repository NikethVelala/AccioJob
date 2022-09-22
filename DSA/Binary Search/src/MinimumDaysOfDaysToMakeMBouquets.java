import java.util.Scanner;

public class MinimumDaysOfDaysToMakeMBouquets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] bloomDay=new int[n];
        for(int i=0;i<n;i++) bloomDay[i]=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(BloomDay(bloomDay,m,k));
    }

    public static int BloomDay(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length)
            return -1;
        int l=1;
        int r=Integer.MIN_VALUE;
        for(int i:bloomDay) r=Math.max(r,i);
        while(l<r){
            int mid=l+(r-l)/2;
            if(feasible(bloomDay,m,k,mid)) r=mid;
            else l=mid+1;
        }
        return l;
    }

    public static boolean feasible(int[] bloomDay, int m, int k, int mid) {
        int continousDays=0;
        int count=0;
        for(int i:bloomDay){
            if(i<=mid) {
                continousDays++;
                if(continousDays>=k) {
                    count++;
                    continousDays=0;
                }
            }else{
                continousDays=0;
            }
        }
        return count>=m;
    }
}
