import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String s=sc.next();
        ArrayList<String> vowels= new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));
        String[] strings=new String[n];
        for(int i=0;i<n;i++) strings[i]=sc.next();

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<strings[i].length();j++)
                if(vowels.contains(String.valueOf(strings[i].toLowerCase().charAt(j)))){
                    count++;
                    System.out.print(s);
                }
                else System.out.println();
            System.out.println(" "+count);
        }
    }
}
