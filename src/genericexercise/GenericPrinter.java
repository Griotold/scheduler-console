package genericexercise;
/**
 * 다양한 재료를 사용한느 3D 프린터를 설계
 *  여기서 T를 Type Parameter : 자료형 매개변수라고 한다.
 * */
public class GenericPrinter<T>{
    private T material;
    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return material.toString();
    }
}
