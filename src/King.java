import java.util.*;
class Student{

     int studentId;
     String studentName;
     int score;
     String collegeName;

    public Student(int studentId, String studentName, int score, String collegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.score = score;
        this.collegeName = collegeName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}

public class King {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[] students=new Student[4];
        for(int i=0;i<4;i++){
            int id=sc.nextInt();
            String name=sc.next();
            int score=sc.nextInt();
            String college=sc.next();
            students[i]=new Student(id,name,score,college);
        }
        Student s=getLowestScoredStudentByCollegeName(students,sc.next());
        if(s==null) System.out.println("No such student found");
        else{
            System.out.println(s.getStudentId());
            System.out.println(s.getStudentName());
            System.out.println(s.getScore());
            System.out.println(s.getCollegeName());
        }
        s=getSecondHighestScoredStudent(students);
        if(s==null) System.out.println("No such student found");
        else{
            System.out.println(s.getStudentId());
            System.out.println(s.getStudentName());
            System.out.println(s.getScore());
            System.out.println(s.getCollegeName());
        }
    }

    public static Student  getLowestScoredStudentByCollegeName(Student[] students, String college){
        int min=Integer.MAX_VALUE;
        for(Student s:students){
            if(s.getCollegeName().equalsIgnoreCase(college))
                min=Math.min(min,s.getScore());
        }
        if(min==Integer.MAX_VALUE) return null;
        else{
            for(Student s:students)
                if(s.getCollegeName().equalsIgnoreCase(college)&&s.getScore()==min)
                    return s;
        }
        return null;
    }

    public static Student getSecondHighestScoredStudent(Student[] students){

        ArrayList<Integer> list=new ArrayList<>();
        for(Student s:students) {
            if (s.getScore() > 500 &&s.getScore()%2==1)
                list.add(s.getScore());
        }
        if(list.size()<2)
        return null;
        else{
            Collections.sort(list);
            for(Student s:students)
                if(s.getScore()==list.get(1))
                    return s;
        }
        return null;
    }
}
