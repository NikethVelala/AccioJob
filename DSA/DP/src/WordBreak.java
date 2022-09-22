import java.util.*;

public class WordBreak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        List<String> wordDict = new ArrayList<>();
        for(int i=0;i<n;i++) wordDict.add(sc.next());
        System.out.println(wordBreak(s,wordDict));
    }
    //own approach
    /*static boolean flag=false;
    private static boolean wordBreak(String s, List<String> wordDict) {
        wordBreak1(s,wordDict);
        return flag;
    }

    private static void wordBreak1(String s, List<String> wordDict) {
        if(s.length()==0) flag=true;
        for(String i:wordDict){
            if(flag) return;
            if(i.length()<=s.length()&&s.substring(0,i.length()).equals(i))
                wordBreak(s.substring(i.length()),wordDict);

        }
    }*/

    public static boolean wordBreak(String s,List<String> wordDict){
        boolean[] b=new boolean[s.length()+1];
        b[s.length()]=true;

        for(int i=s.length()-1;i>=0;i--){
            for(String s1:wordDict){
                if((i+s1.length())<=s.length()&&s.substring(i,i+s1.length()).equals(s1))
                    b[i]=b[i+s1.length()];
                if(b[i]) break;
            }
        }
        return b[0];
    }
}
