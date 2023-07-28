import java.util.Arrays;
import java.util.Iterator;

public class GBArrayList<T> implements IList {

    private T[] values;

    @SuppressWarnings("unchecked")
    public GBArrayList() {
        this.values = (T[]) new Object[0];
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean add(Object o) {
        try {
            T[] tempArray = values;
            values = (T[]) new Object[tempArray.length + 1];
            System.arraycopy(tempArray, 0, values, 0, tempArray.length); //иетод, позволяющий копировать массивы быстро используя прямой доступ к памяти посредством C++
            values[values.length - 1] = (T) o;
            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public void remove(int index) {
        try {
            T[] tempArray = values;
            values = (T[]) new Object[tempArray.length - 1];
            System.arraycopy(tempArray, 0, values, 0, index);
            int amountElemAfterIndex = tempArray.length - index - 1;
            System.arraycopy(tempArray, index + 1, values, index, amountElemAfterIndex);
        } catch (ClassCastException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, Object t) {
        values[index] = (T) t;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<T>(values);
    }

    @Override
    public String toString() {
        return "GBArrayList{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
