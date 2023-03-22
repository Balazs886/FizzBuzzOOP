package hu.ak_akademia.oop.fizzbuzz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Numbers implements Iterable<Integer> {
    private int upperLimit;
    int arrayPointer = 0;
    private List<Integer> numbers = new ArrayList<>();

    public Numbers(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return arrayPointer + 1 <= upperLimit;
            }

            @Override
            public Integer next() {
                arrayPointer++;
                numbers.add(arrayPointer);
                return arrayPointer;
            }
        };
    }
}
