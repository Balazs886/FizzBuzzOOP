package hu.ak_akademia.oop.fizzbuzz;

import hu.ak_akademia.oop.tagger.DividableChecker;
import hu.ak_akademia.oop.tagger.DividableTaggers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Integer> lofaszLista = new ArrayList<>();
        lofaszLista.add(1);
        lofaszLista.add(2);
        lofaszLista.add(3);
        lofaszLista.add(4);

//        for (String element : lofaszLista) {
//            System.out.println(element);
//        }
        Iterator<Integer> lofaszListaIterator = lofaszLista.iterator();

        while (lofaszListaIterator.hasNext()) {
            System.out.println(lofaszListaIterator.next());
        }


        System.out.println("Add meg a felső határt (50 ≤ N ≤ 1000)");
        Numbers numbers = new Numbers(giveUpperLimit());

        Iterator<Integer> numbersIterator = numbers.iterator();

        while (numbersIterator.hasNext()) {
            Integer nextElement = numbersIterator.next();
            System.out.printf("%4d", nextElement);

            DividableChecker dividable3 = new DividableChecker(nextElement, 3);
            DividableChecker dividable5 = new DividableChecker(nextElement, 5);
            DividableChecker dividable7 = new DividableChecker(nextElement, 7);

            DividableTaggers dividableTaggers3 = new DividableTaggers(dividable3.isDividable());
            System.out.print(dividableTaggers3);
            DividableTaggers dividableTaggers5 = new DividableTaggers(dividable5.isDividable());
            System.out.print(dividableTaggers5);
            DividableTaggers dividableTaggers7 = new DividableTaggers(dividable7.isDividable());
            System.out.print(dividableTaggers7);

            System.out.println();

        }

    }

    private static int giveUpperLimit() {
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
