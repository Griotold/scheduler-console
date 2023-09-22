package lambda;
interface PrintString {
    void showString(String str);
}
public class testLambda {
    public static void main(String[] args) {
        PrintString lambdaStr = s -> System.out.println(s);
        lambdaStr.showString("hello lambda_1");
        showMyString(lambdaStr);

        PrintString returnStr = returnString();
        returnStr.showString("Hello");
    }
    public static void showMyString(PrintString p) {
        p.showString("hello lambda_2");
    }

    public static PrintString returnString() {
        return s -> System.out.println(s + " world3");
    }
}
