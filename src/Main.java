abstract class Shapes{
    abstract void area(int x,int y);
}

class Square extends Shapes{
    public void area(int x,int y){
        System.out.println("Area of Square is "+x*x);
    }
}

class Rectangle {
    public static void area(int x,int y){
        System.out.println("Area of Rectangle is "+x*y);
    }
}

public class Main {
    public static void main(String[] args) {
        Square square=new Square();

        square.area(5,6);
        Rectangle.area(5,6);
    }
}