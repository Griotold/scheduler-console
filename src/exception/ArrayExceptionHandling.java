package exception;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            // 크기가 5인 배열에 6개의 요소를 집어 넣는 코드
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("예외 처리 부분");
        }
        System.out.println("프로그램 종료");
    }
}
