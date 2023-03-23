package hu.ak_akademia.oop.fizzbuzz;

import hu.ak_akademia.oop.tagger.DividableChecker;
import hu.ak_akademia.oop.tagger.DividableTaggers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Add meg a felső határt (50 ≤ N ≤ 1000)");
        Numbers numbers = new Numbers(giveUpperLimit());

        DividableTaggers dividableTaggers = new DividableTaggers();

        for (Integer number : numbers) {
            System.out.format("%4d%s\n", number, dividableTaggers.generateTaggers(number));
        }

    }

    private static int giveUpperLimit() {
        // TODO: 2023. 03. 23. ez mi a bánat?
        Scanner scanner = new Scanner(System.in);
        int upperLimit;
        boolean firstRun = true;
        do {
            if (firstRun == false) {
                System.out.println("Helytelen értéket adtál meg, kérlek figyelj!");
            }
            firstRun = false;
            System.out.print("N = ");
            upperLimit = scanner.nextInt();
        } while (upperLimit < 50 || upperLimit > 1000);
        scanner.close();
        return upperLimit;
    }

}
