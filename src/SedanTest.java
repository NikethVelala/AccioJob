import org.junit.Assert;
import org.junit.Test;
public class SedanTest {
    @Test
    public void sedanPrice() {
        Sedan s=new Sedan();
        Assert.assertEquals(140,s.sedanPrice(10));
    }
}
