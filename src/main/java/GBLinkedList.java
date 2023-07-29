import org.w3c.dom.Node;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GBLinkedList <E> implements IList {
    private int size = 0;
    private Node<E> first;
    private Node<E> last;
    private int counter = 0;

    private static  class Node<E> {
        E item;
         private Node<E> next;
        private Node <E> prev;


        public Node( Node<E> prev,E item, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

        public Node<E> getPrev() {
            return prev;
        }
    }
    Node<E> node(int index) {
        if (index < size) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }


    @SuppressWarnings("unchecked")
    @Override
    public boolean add(Object o) {
        try {
            Node<E> l = last;
            Node<E> newNode = new Node<>(l, (E)o, null);
            last = newNode;
            if (l == null)
                first = newNode;
            else
                l.next = newNode;
            size++;
            counter++;
            return true;
        }catch (ClassCastException e) {
            return false;
        }
    }

    @Override
    public boolean add(int index, Object o) {
        return false;
    }

    @Override
    public void remove(int index) {
    }
    @Override
    public Object get(int index) {
        if (index < this.size) {
            return node(index).item;
        }
        else return -1;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void update(int index, Object o) {

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public String toString() {
        return "GBLinkedList{" +
                "size=" + size +
                ", first=" + first +
                ", last=" + last +
                ", counter=" + counter +
                '}';
    }
}
