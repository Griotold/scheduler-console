package baek.java8.ch1;

public class Foo {
    public static void main(String[] args) {
//        RunSomething runSomething = new RunSomething() {
//            @Override
//            public void doIt() {
//                System.out.println("라라라");
//            }
//        };
        RunSomething runSomething = () -> System.out.println("라라라");
    }
}
