package collectionexercise;

import java.util.Objects;

public class Member implements Comparable<Member>{
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return memberId == member.memberId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId);
    }
    /**
     * compareTo() 재정의
     * 추가한 회원 아이디와 매개변수로 받은 회원 아이디를 비교
     * 오름차순 정렬
     * 리턴값이 양수라면 새로 추가된 객체는 오른쪽으로 간다
     * */
//    @Override
//    public int compareTo(Member member) {
//        return (this.memberId - member.memberId);
//    }
    /**
     * 회원 이름순으로 정렬
     * */
    @Override
    public int compareTo(Member member) {
        return this.memberName.compareTo(member.memberName);  //String 클래스에 compareTo() 가 정의되어 있으므로 활용
    }
}
