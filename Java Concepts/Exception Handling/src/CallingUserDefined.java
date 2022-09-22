
class Sample{
    public void sit() throws MyException{
        MyException me = new MyException("Some Description");
        throw me;
    }
}

public class CallingUserDefined {
    public static void main(String[] args) {
        try{
            /*MyException me = new MyException("Some description");
            throw me;*/
            Sample sample = new Sample();
            sample.sit();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
