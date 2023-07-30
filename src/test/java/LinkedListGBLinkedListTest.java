import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListGBLinkedListTest {
    @Test
    void addTest(){
        GBLinkedList<Integer> numLinkLst = new GBLinkedList<>();
        numLinkLst.add(9);
        numLinkLst.add(4);
        numLinkLst.add(11);
        numLinkLst.add(8);
        Assertions.assertEquals(8, numLinkLst.get(3));
        //Assertions.assertNull(null);
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
    @Test
    void addFirstTest(){
        GBLinkedList<Integer> numLinkLst = new GBLinkedList<>();
        numLinkLst.add(9);
        numLinkLst.add(4);
        numLinkLst.add(11);
        numLinkLst.add(8);
        numLinkLst.addFirst(566);
        Assertions.assertEquals(566, numLinkLst.get(0));
    }
    @Test
    void getLastTest(){
        GBLinkedList<Integer> numLinkLst = new GBLinkedList<>();
        numLinkLst.add(9);
        numLinkLst.add(4);
        numLinkLst.add(11);
        numLinkLst.add(8);
        Assertions.assertEquals(numLinkLst.get(numLinkLst.size()-1), numLinkLst.getLast());

    }
    @Test
    void addLastTest(){
        GBLinkedList<Integer> numLinkLst = new GBLinkedList<>();
        numLinkLst.add(9);
        numLinkLst.add(4);
        numLinkLst.add(11);
        numLinkLst.add(8);
        numLinkLst.addLast(787);
        Assertions.assertEquals(787, numLinkLst.getLast());

    }
}
