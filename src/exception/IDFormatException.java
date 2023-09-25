package exception;
/**
 * 유사한 예외 클래스를 잘 모르겠다면 Exception 클래스를 상속 받으라.
 * */
public class IDFormatException extends Exception{
    public IDFormatException(String message) {
        super(message);
    }
}
