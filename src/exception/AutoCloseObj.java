package exception;
/**
 * try-with-resources를 사용하려면 AutoCloseable을 구현해야한다.
 * */
public class AutoCloseObj implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("리소스가 close() 되었습니다.");
    }
}
