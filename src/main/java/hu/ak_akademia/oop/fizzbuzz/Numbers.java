package hu.ak_akademia.oop.fizzbuzz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Numbers implements Iterable<Integer> {
    private int upperLimit;
    int arrayPointer = 0;
    private List<Integer> numbers = new ArrayList<>();

    // TODO: 2023. 03. 23. nem tudom, hogy minek ez az osztaly es hogy hogy akarod feltotleni, ezert ide teszem ezt az feltoltest
    {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(21);
        numbers.add(24);
        numbers.add(49);
        numbers.add(80);
        numbers.add(105);
        numbers.add(155);
        numbers.add(155);
    }
    public Numbers(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    @Override
    public Iterator<Integer> iterator() {
        return numbers.iterator();
    }
}
