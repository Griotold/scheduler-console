package jungsuk.ch6;

public class Exercise6_3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("홍길동");
        s.setBan(1);
        s.setNo(1);
        s.setKor(100);
        s.setEng(60);
        s.setMath(76);

        System.out.println("s.getName() = " + s.getName());
        System.out.println("총점 = " + s.getTotal());
        System.out.println("평균 = " + s.getAverage());
    }
}
