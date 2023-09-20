package collectionexercise.set.treeset;

import collectionexercise.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberPark = new Member(1003, "박서원");
        Member memberLee = new Member(1001, "이순신");
        Member memberSon = new Member(1002, "손흥민");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberSon);
        memberTreeSet.addMember(memberPark);
        memberTreeSet.showAllMember();

        Member memberHong = new Member(1003, "홍길동"); // 아이디 중복 회원 추가
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();
    }
}
