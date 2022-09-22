import java.util.ArrayList;

public class gainsight {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);al.add(2);al.add(3);al.add(4);
        /*Integer[] a=new Integer[al.size()];
        a=al.toArray(a);*/
        int[] arr = al.stream().mapToInt(i->i).toArray();
        System.out.println(king());
    }

    public static String king(){

        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);al.add(2);al.add(3);al.add(4);
        return al.get(0)+""+al.get(1);
    }
}
