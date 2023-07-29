import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayGBArrayListTest {
    @Test
    void addTest(){
    GBArrayList<Double> doubleList = new GBArrayList<>();
    doubleList.add(2.3);
        Assertions.assertEquals(2.3, doubleList.get(0));

    }
    @Test
    void addNegativeTest(){
        GBArrayList<Double> doubleList = new GBArrayList<>();
        doubleList.add(2.3);
        Assertions.assertNotEquals(2.2, doubleList.get(0));

    }
    
}
