package genericexercise;
/**
 * 좌표 체계
 * x와 y 값은 정수일 수도 실수 일 수도
 * */
public class Point<T, V> {
    T x;
    V y;

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }
}
