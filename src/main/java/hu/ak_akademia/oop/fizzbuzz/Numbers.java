package hu.ak_akademia.oop.fizzbuzz;

public class Numbers {
    private int upperLimit;
    private int numbers[];

    public Numbers(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public int[] getNumbers() {
        construct();
        return numbers;
    }

    private void construct() {
        numbers = new int[upperLimit];
        for (int i = 0; i < upperLimit; i++) {
            numbers[i] = i + 1;
        }
    }
}
