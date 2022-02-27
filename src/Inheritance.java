class Student1{
    public int id;
    public String name;
    public double salary;

    public Student1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void salaryHike(){
        salary= salary * 2;    //  salary* = 2;
        System.out.print("My present salary is "+salary+" \n");
    }
}

//inheritance
class Student2 extends Student1{
    public Student2(int id, String name, double salary) {
        super(id, name, salary);
    }

    public int incrementId(){
        return id+1;
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Student2 student2Obj = new Student2(60,"Goutham",50000.0);
        System.out.println(student2Obj.incrementId());
        student2Obj.salaryHike();

    }
}
