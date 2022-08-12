package de.fraunhofer.iem.collections.iterators.iterable.inCustomClass;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Demonstrates the custom class implements the Iterable in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class FiveInts implements Iterable<Integer> {
    private static final int SIZE = 5;
    private final int[] data = new int[5];

    public FiveInts(int first, int second, int third, int fourth, int fifth) {
        this.data[0] = first;
        this.data[1] = second;
        this.data[2] = third;
        this.data[3] = fourth;
        this.data[4] = fifth;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FiveIntsIterator();
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }

    private class FiveIntsIterator implements Iterator<Integer> {
        int currentCursor = -1;
        int nextCursor;

        @Override
        public boolean hasNext() {
            return currentCursor < SIZE - 1;
        }

        @Override
        public Integer next() {
            nextCursor = ++currentCursor;
            return data[nextCursor];
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }

        @Override
        public void forEachRemaining(Consumer<? super Integer> action) {
            Iterator.super.forEachRemaining(action);
        }
    }
}
