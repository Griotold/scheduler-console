import genericexercise.GenericPrinter;
import genericexercise.Plastic;
import genericexercise.Powder;

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
    }
}
