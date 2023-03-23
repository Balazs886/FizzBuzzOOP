package hu.ak_akademia.oop.tagger;

public class DividableConfig {
    DividableChecker dividableChecker;
    String decoratorText;

    public DividableConfig(DividableChecker dividableChecker, String decoratorText) {
        this.dividableChecker = dividableChecker;
        this.decoratorText = decoratorText;
    }

    public DividableChecker getDividableChecker() {
        return dividableChecker;
    }

    public DividableConfig setDividableChecker(DividableChecker dividableChecker) {
        this.dividableChecker = dividableChecker;
        return this;
    }

    public String getDecoratorText() {
        return decoratorText;
    }

    public DividableConfig setDecoratorText(String decoratorText) {
        this.decoratorText = decoratorText;
        return this;
    }
}
