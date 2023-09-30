package jungsuk.ch6;

import java.text.DecimalFormat;

/**
 * 6-1 연습문제
 * */
public class Student {
    private String name;
    private int ban;
    private int no;
    private int kor;
    private int eng;
    private int math;

    public Student() {
    }

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String info() {
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math;
    }

    public int getTotal() {
        return this.getKor() + this.getEng() + this.getMath();
    }
    /**
     * 소수점 둘 째 자리에서 반올림
     * */
    public double getAverage() {
        int sum = getTotal();
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        return Double.parseDouble(decimalFormat.format((double) sum / 3.0));
//        return sum / 3.0;
//        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }
}
