import org.junit.Test;
import static org.junit.Assert.*;

public class foneTest {
    @Test
    public void princeValueTest(){
        King1 k=new King1(10);
        assertEquals(100,k.princeValue());
    }
}