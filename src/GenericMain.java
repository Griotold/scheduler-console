import genericexercise.GenericPrinter;
import genericexercise.Plastic;
import genericexercise.Powder;
import genericexercise.PrinterV1;

public class GenericMain {

    public static void main(String[] args) {
        // Powder를 재료로 사용하는 3D 프린터
        GenericPrinter<Powder> powderPrinter= new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);

        // Plastic을 재료로 사용하는 3D 프린터
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);

        // 제네릭을 사용하지 않은 프린터는 직접 형변환해줘야하는 번거로움이 생긴다.
        PrinterV1 printerV1 = new PrinterV1();
        Powder p1 = new Powder();
        printerV1.setMaterial(p1); // 여기는 자동 형변환!
        Powder material = (Powder) printerV1.getMaterial(); // 여기는 직접 형변환
    }
}
