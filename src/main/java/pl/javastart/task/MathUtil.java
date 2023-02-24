package pl.javastart.task;

public class MathUtil {
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    static double circleField(double radius) {
        return Math.PI * radius * radius;
    }

    static int power(int number) {
        return number * number;
    }
}
