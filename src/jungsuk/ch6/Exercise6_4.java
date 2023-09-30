package jungsuk.ch6;


public class Exercise6_4 {
    static double getDistance(int x, int y, int x1, int y1) {
        int width = Math.abs(x - x1);
        int height = Math.abs(y - y1);
        return Math.sqrt(width*width + height*height);

    }
    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
