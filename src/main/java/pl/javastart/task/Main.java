package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        System.out.println(MathUtil.power(3) == 9);
        System.out.println(MathUtil.circleField(3) == 9*Math.PI);
        System.out.println(MathUtil.isEven(3) == false);
        System.out.println(MathUtil.isOdd(3) == true);
    }
}
