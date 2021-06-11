package HW2;

public class HomeWork2 {
    public static void main(String[] args) {

        if (twoNumbers(20, 2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        SecondEx(0);
        ThirdEx(8);
        System.out.println(ThirdEx(-5));
        ForthEx("HI", 0);

        System.out.println(WhatYear(600));

    }

    public static boolean twoNumbers(int a, int b) {
        return ((a + b) >= 10 && (a + b) <= 20);
    }

    public static void SecondEx(int s) {
        if (s >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

    }

    public static boolean ThirdEx(int z) {
        if (z >= 0) {
            return true;
        }
        return false;
    }

    public static void ForthEx(String Word, int y) {
        for (y = 0; y < 5; y++) {
            System.out.println(Word);
        }
    }
    public static boolean WhatYear(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0 ) {
            return true;
        } else
            return false;
    }
}
