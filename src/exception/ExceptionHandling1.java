package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e); // 예외 클래스의 toString() 호출
        }
        System.out.println("프로그램은 정상 종료된 게 맞다");
    }
}
