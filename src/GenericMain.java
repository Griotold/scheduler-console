import genericexercise.*;

public class GenericMain {

    public static void main(String[] args) {
        // Material 추상 클래스를 상속받지 않은 재료는 사용될 수 없다.
//        GenericPrinter<Water> invalidPrinter = new GenericPrinter<>();

        // T형 material 변수에서 printing을 호출 할 수 있다.
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();
        powderGenericPrinter.setMaterial(new Powder());
        powderGenericPrinter.printing();

        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>();
        plasticGenericPrinter.setMaterial(new Plastic());
        plasticGenericPrinter.printing();
    }
}
