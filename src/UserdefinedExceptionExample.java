public class UserdefinedExceptionExample {
    public static void main(String[] args){
        try {
            method();
        }catch(MyOwnExceptionKind e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static void method() throws MyOwnExceptionKind{
        int k = 8/9;
        if(k==0)
            throw new MyOwnExceptionKind("Value of k shouldn't be zero");
    }
}
