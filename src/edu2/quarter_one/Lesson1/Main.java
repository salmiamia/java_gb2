package edu2.quarter_one.Lesson1;

public class Main {

    byte b = 4;
    short s = 16353;
    int i = 15357565;
    long l = 23537475673647344L;
    float f = 0.15f;
    double d = 32.146337;
    boolean boo = true;
    char c = 't';

    public static void main(String[] args) {
        System.out.println(formula(1, 5, 16, 8));
        System.out.println(checkSumFrom10To20(15, 25));
        isPositiveOrNegative(6);
        System.out.println(isNumberNegative(4));
        helloName("Павел");
        yearPrint(200);
    }

    public static int formula (int a, int b, int c, int d) {
        int result = a * (b + (c / d));
        return result;
    }

    public static boolean checkSumFrom10To20 (int a1, int a2) {
        int sum = a1 + a2;
        if (10 <= sum && sum <= 20) return true;
        return false;
    }

    public static void isPositiveOrNegative(int i) {
        String result = i < 0 ? "negative" : "positive";
        System.out.println("Number " + i + " is " + result);
    }

    public static boolean isNumberNegative(int i) {
        return i < 0;
    }

    public static void helloName(String s) {
        System.out.println("Привет, " + s + "!");
    }

    public static boolean year(int i) {
        if (i % 400 == 0) return true;
        else if (i % 100 == 0) return false;
        else if (i % 4 == 0) return true;
        return false;
    }

    public static void yearPrint(int i) {
        boolean result = year(i);
        String text = result ? "Год " + i + " является високосным." : "Год " + i + " не является високосным.";
        System.out.println(text);
    }
}
