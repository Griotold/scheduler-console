package collectionexercise.set.hashset;

import collectionexercise.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손흥민");
        Member memberPark = new Member(1003, "박지성");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberSon);
        memberHashSet.addMember(memberPark);
        memberHashSet.showAllMember();

        Member memberHong = new Member(1003, "홍길동"); // ID가 박지성과 중복!
        memberHashSet.addMember(memberHong);
        memberHashSet.showAllMember();
    }
}
