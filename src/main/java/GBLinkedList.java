import org.w3c.dom.Node;

import java.util.*;

public class GBLinkedList<E> implements IList {
    private int size = 0;
    private Node<E> first;
    private Node<E> last;
    private int counter = 0;

    private static class Node<E> {
        E elem;
        private Node<E> next;
        private Node<E> prev;


        public Node(Node<E> prev, E elem, Node<E> next) {
            this.elem = elem;
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
            Node<E> newNode = new Node<>(l, (E) o, null);
            last = newNode;
            if (l == null)
                first = newNode;
            else
                l.next = newNode;
            size++;
            counter++;
            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }

    public void addFirst(E e){
        Node<E> f = first;
        Node<E> newNode = new Node<>(null, e, f);
        first = newNode;
        if (f == null)
            last = newNode;
        else
            f.prev = newNode;
        size++;
        counter++;
    }
    public void addLast(Object o) {
        add(o);
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
            return node(index).elem;
        } else return -1;
    }

    public E getLast() {
        Node<E> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return l.elem;
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
