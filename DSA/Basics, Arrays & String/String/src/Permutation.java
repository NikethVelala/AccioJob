// https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1#
// https://www.youtube.com/watch?v=GuTPwotSdYw
import java.util.*;
public class Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Permutation permute=new Permutation();
        List<String> permutation = permute.find_permutation(s, 0, s.length() - 1);
        Collections.sort(permutation);
        for(String s1:permutation) System.out.print(s1+" ");
    }
    List<String> list=new ArrayList<>();
    public List<String> find_permutation(String S,int l, int r) {
        if(l==r) list.add(S);

        for(int i=l;i<=r;i++){
            S = swap(S,l,i);
            find_permutation(S,l+1,r);
            S=swap(S,l,i);
        }
        return list;
    }

    public String swap(String S, int i, int j){
        char[] a = S.toCharArray();
        char temp = a[i];
        a[i]=a[j];
        a[j]=temp;
        return String.valueOf(a);
    }
}
