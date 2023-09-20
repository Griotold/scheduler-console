package collectionexercise;

import java.util.Comparator;

public class Member2 implements Comparator<Member2> {
    private int memberId;
    private String memberName;

    public Member2(int memberId, String memberName) {
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
        return "Member2{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }
    /**
     * 첫 번째 매개변수가 더 클 때 양수를 반환하여 오름차순으로 정렬
     * */

    @Override
    public int compare(Member2 mem1, Member2 mem2) {
        return mem1.getMemberId() - mem2.getMemberId();
    }
}
