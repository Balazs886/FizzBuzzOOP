package hu.ak_akademia.oop.tagger;

import java.util.ArrayList;
import java.util.List;

public class DividableTaggers {
    private List<DividableConfig> configs = new ArrayList<>();

    {
        configs.add(new DividableConfig(new DividableChecker(3), " Fizz"));
        configs.add(new DividableConfig(new DividableChecker(5), " Buzz"));
        configs.add(new DividableConfig(new DividableChecker(7), " Chirpy"));
    }

    public String generateTaggers(Integer number) {
        String result = "";
        for (DividableConfig config : configs) {
            if (config.getDividableChecker().isDividable(number)) {
                result += config.getDecoratorText();
            }
        }
        return result;
    }
}
