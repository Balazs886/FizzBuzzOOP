package hu.ak_akademia.oop.tagger;

public class DividableTaggers {
    private Integer dividableNumberForTaggers;

    public DividableTaggers(Integer dividableNumberForTaggers) {
        this.dividableNumberForTaggers = dividableNumberForTaggers;
    }

    @Override
    public String toString() {
        String string = "";
        switch (dividableNumberForTaggers) {
            case 3:
                string += " Fizz";
                break;
            case 5:
                string += " Buzz";
                break;
            case 7:
                string += " Chirpy";
                break;
            default:
                string += "";
                break;
        }
        return string;
    }
}
