package ru.mirea.practice.task14;

public abstract class LeftNumber {

    public static String recursion(Integer n) {
        if (n < 10) {
            return n.toString();
        } else {
            return recursion(n / 10) + " " + n % 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(1234));
    }
}
