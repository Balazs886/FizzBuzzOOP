package hu.ak_akademia.oop.tagger;

public class DividableChecker {

    private Integer number;
    private Integer divider;

    public DividableChecker(Integer number, Integer divider) {
        this.number = number;
        this.divider = divider;
    }

    public Integer isDividable() {
        if (number % divider == 0) {
            return divider;
        }
        return -1;
    }
}
