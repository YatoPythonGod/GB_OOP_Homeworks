package Task_4;

public interface Hurma<E extends Comparable<E>> extends Iterable<E>{

    boolean add(E e);

    E get(int index);

    void update(int index, E value);

    int size();
    void remove(int index);
    void removeByValue(E value);

    E min();
    E max();

    Double sum();
    Double mult();
    int index(E value);
    boolean search(E value);
    void sortBubble();

    void sortInsertion();

    void sortSelection();



}
