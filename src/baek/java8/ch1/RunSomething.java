package baek.java8.ch1;
@FunctionalInterface
public interface RunSomething {

    void doIt();

//    void doItAgain();

    static void staticMethod() {
        System.out.println("자바 8 부터 가능해졌다.");
    }

    default void defaultMethod() {
        System.out.println("역시 자바 8 부터 가능해졌다.");
    }
}
