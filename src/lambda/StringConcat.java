package lambda;
/**
 * 두 문자열을 쉼표를 사이에 두고 연결해주는 기능
 * */
@FunctionalInterface
public interface StringConcat {
    void makeString(String s1, String s2);
}
