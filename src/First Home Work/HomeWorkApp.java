package HW1;



public class HomeWorkApp {

    public static void main (String[]args) {
printThreeWords();
checkSumSign();
printColor();
compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana ");
        System.out.println("_Apple");
    }
    public static void checkSumSign() {
        int a = 0;
        int b = 0;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }
public static void printColor() {
        int value = 150;
        if (value <= 0) {
            System.out.println("Красный");
        } else {
            if (value > 100) {
                System.out.println("Зелёный");
            } else {
                System.out.println("Жёлтый");
            }
        }

}
public static void compareNumbers() {
        int a = -4;
        int b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
}

}

