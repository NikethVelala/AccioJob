import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

//if we do this then it won't consider as a functional interface but like a normal interface
/*@FunctionalInterface
public interface UPIPayment extends TestInterface{*/
@FunctionalInterface
public interface UPIPayment{
    String doPayments(String source, String dest);

    default double getScratchCard(){
        return new Random().nextDouble();
    }
    
    //Similar to utility methods present in a project
    static String datePatterns(String patterns) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(patterns);
        return dateFormat.format(new Date());
    }
}
