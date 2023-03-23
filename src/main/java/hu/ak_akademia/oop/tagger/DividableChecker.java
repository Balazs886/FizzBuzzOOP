package hu.ak_akademia.oop.tagger;

public class DividableChecker {
    private Integer divider;

    public DividableChecker(Integer divider) {
        this.divider = divider;
    }

    public boolean isDividable(Integer number) {
        return number % divider == 0;
    }
}
