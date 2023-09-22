package lambda;

public class TestMyNumber {
    public static void main(String[] args) {
        // 이렇게도 할 수 있다.
        MyNumber max2 = (x, y) -> {
            if (x >= y) return x;
            else return y;
        };
        // 되도록 이면 짧게! 생략할 수 있는 부분은 생략하여 구현하자
        MyNumber max = (x, y) -> (x >= y) ? x : y;
        System.out.println(max.getMax(10, 20));
    }
}
