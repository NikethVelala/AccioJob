class Class1{
    int x;String y;float z;
    public Class1(){
        x=10;
        y="niketh";
        z=1;
    }
   public Class1(int x, String y,float z){
       this.x=x;
       this.y=y;
       this.z=z;
   }
   public int sum10(int a,int b){
        int x=5,y=6;
        int sum1=x+y;
        goutham();
        return sum1;
   }
   public void goutham(){
       System.out.println("Hi.. this is goutham");
   }
}

class Class2 extends Class1{

}
public class MethodsInClass {
    public static void main(String[] args) {
        Class1 ob=new Class1(15,"goutham",5.5f);
        Class1 ob1=new Class1();
        Class2 obofclass2 =new Class2();
        obofclass2.goutham();
        ob.sum10(1,2);
        System.out.println("Hero");
    }
}
