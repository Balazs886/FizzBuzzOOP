package hu.ak_akademia.oop.fizzbuzz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Add meg a felső határt (50 ≤ N ≤ 1000)");
        Numbers numbers = new Numbers(giveANumber());
//        giveANumber();

        for (int number : numbers.getNumbers()) {
            System.out.printf("%4d\n", number);
        }
    }

    private static int giveANumber() {
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
