package jungsuk.ch6;
/**
 * 6-6
 * */
public class MyPoint {
    int x;
    int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(int x1, int y1) {
        int width = Math.abs(x - x1);
        int height = Math.abs(y - y1);
        return Math.sqrt(width*width + height*height);
    }
}
