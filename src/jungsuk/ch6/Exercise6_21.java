package jungsuk.ch6;

public class Exercise6_21 {
    private static int abs(int value) {
        if(value < 0) return -value;
        return value;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절댓값: " + abs(value));

        value = -10;
        System.out.println(value + "의 절댓값: " + abs(value));
    }
}
