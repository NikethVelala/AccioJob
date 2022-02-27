import java.util.HashMap;
import java.util.Scanner;

public class StringInAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),p=sc.next();
        System.out.println(smallestWindow(s,p));
    }

    public static String smallestWindow(String s, String p) {
        String small=null;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<p.length();i++)
            if(map.containsKey(p.charAt(i))) map.put(p.charAt(i),map.get(p.charAt(i))+1);
            else map.put(p.charAt(i),1);
        int i=0,count= map.size();
        for(int j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                count-=map.get(s.charAt(j))==0?1:0;
            }
            while(count==0&&i<=j){
                if(map.containsKey(s.charAt(i))) {
                    if(map.get(s.charAt(i))==0)
                        break;
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                }
                i++;
            }
            if(count==0){
                if(small!=null){
                    if(small.length()>j-i+1)
                        small=s.substring(i,j+1);
                }else
                    small=s.substring(i,j+1);
            }
        }
        if(small==null) return "-1";
        return small;
    }
}
