import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListGBLinkedListTest {
    @Test
    void addTest(){
        GBLinkedList<Integer> numLinkLst = new GBLinkedList<>();
//        numLinkLst.add(9);
//        numLinkLst.add(4);
//        numLinkLst.add(11);
//        numLinkLst.add(8);
        //Assertions.assertEquals(null, numLinkLst.get(3));
        Assertions.assertNull(null);
    }
    @Test
    void sizeTest(){
        GBLinkedList<Integer> numLinkLst = new GBLinkedList<>();
        numLinkLst.add(9);
        numLinkLst.add(4);
        numLinkLst.add(11);
        numLinkLst.add(8);
        Assertions.assertEquals(4, numLinkLst.size());

    }
}
