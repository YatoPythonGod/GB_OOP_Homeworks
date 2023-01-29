package Task_4;

import Task_3.BasicFigure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class HurmaList<E extends Comparable<E>> implements Hurma<E> {

    private E[] values;

    public HurmaList(E[] values) {
        this.values = values;
    }

    public HurmaList() {
        this.values = (E[]) new Comparable[0];
    }


    @Override
    public boolean add(E element) {
        try {
            E[] newArray = Arrays.copyOf(values, values.length + 1);
            newArray[values.length] = element;
            values = newArray;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public void update(int index, E value) {
        values[index] = value;
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void remove(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Comparable[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            System.arraycopy(temp, index + 1, values, index, temp.length - index - 1);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void removeByValue(E value) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] instanceof String) {
                if (values[i].equals(value)) {
                    this.remove(i--);
                }
            } else {
                if (values[i] == value) {
                    this.remove(i--);
                }
            }
        }
    }

    @Override
    public E min() {
        E min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(min) < 0) {
                min = values[i];
            }
        }
        return min;
    }

    @Override
    public E max() {
        E max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(max) > 0) {
                max = values[i];
            }
        }
        return max;
    }


    //sum and mult methods can not be implemented as E does not have the capability of mathematical operations.
    @Override
    public Double sum() {
        return Arrays.stream(values)
                .mapToDouble(
                        value -> {
                            if (value instanceof Integer) return (double) (Integer) value;
                            else if (value instanceof Long) return (double) (Long) value;
                            else if (value instanceof Float) return (double) (Float) value;
                            else if (value instanceof Double) return (Double) value;
                            else throw new IllegalArgumentException();
                        })
                .sum();
    }

    //sum and mult methods can not be implemented as E does not have the capability of mathematical operations.
    @Override
    public Double mult() {
        Double result = 1.0;
        for (E value : values) {
            if (value instanceof Integer) result *= (Integer) value;
            else if (value instanceof Long) result *= (Long) value;
            else if (value instanceof Float) result *= (Float) value;
            else if (value instanceof Double) result *= (Double) value;
            else throw new IllegalArgumentException();
        }
        return result;
    }

    @Override
    public int index(E value) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == value) return i;
        }
        return -1;
    }

    @Override
    public boolean search(E value) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == value) return true;
        }
        return false;
    }

    @Override
    public void sortBubble() {
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - 1 - i; j++) {
                if (values[j].compareTo(values[j + 1]) > 0) {
                    E temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void sortInsertion() {
        for (int i = 1; i < values.length; i++) {
            E temp = values[i];
            int j = i;
            while (j > 0 && values[j - 1].compareTo(temp) > 0) {
                values[j] = values[j - 1];
                j--;
            }
            values[j] = temp;
        }
    }


    @Override
    public void sortSelection() {
        for (int i = 0; i < values.length - 1; i++) {
            int min_i = i;
            for (int j = i + 1; j < values.length; j++) {
                if (values[j].compareTo(values[min_i]) < 0) {
                    min_i = j;
                }
                E temp = values[i];
                values[i] = values[min_i];
                values[min_i] = temp;
            }

        }
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }

    @Override
    public Iterator<E> iterator() {
        return new HurmaIterator<E>(values);
    }

}
