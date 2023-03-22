package hu.ak_akademia.oop.tagger;

import hu.ak_akademia.oop.fizzbuzz.Numbers;

import java.util.List;

public class DividableTaggers {
    private Integer number;

    public DividableTaggers(Integer number) {
        this.number = number;
    }

    public boolean isDividable5() {
        return number % 5 == 0;
    }

    public boolean isDividable3() {
        return number % 3 == 0;
    }

    @Override
    public String toString() {
        String string = "";
        if (isDividable3()) { string += " Fizz"; }
        if (isDividable5()) { string += " Buzz"; }
        return string;
    }
}
