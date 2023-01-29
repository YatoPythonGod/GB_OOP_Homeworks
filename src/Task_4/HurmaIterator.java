package Task_4;

import java.util.Iterator;

public class HurmaIterator<E> implements Iterator<E> {

    private int index = 0;
    private E[] values;

    public HurmaIterator(E[] values) {
        this.values = values;
    }


    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
