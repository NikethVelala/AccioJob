import java.util.*;

public class Exam {
    public static void main(String[] args) {
        Exam e=new Exam();
        List<List<Integer>> a = e.generate(5);
        System.out.println(a);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            row.add(0, 1);
            for(int j=1;j<row.size()-1;j++)
                row.set(j, row.get(j)+row.get(j+1));
            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;
    }
}

