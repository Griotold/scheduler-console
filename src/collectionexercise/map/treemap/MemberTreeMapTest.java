package collectionexercise.map.treemap;

import collectionexercise.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberLee = new Member(1003, "이순신");
        Member memberSon = new Member(1001, "손흥민");
        Member memberPark = new Member(1004, "박지원");
        Member memberHong = new Member(1002, "홍길동");

        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberSon);
        memberTreeMap.addMember(memberPark);
        memberTreeMap.addMember(memberHong);

        memberTreeMap.showAllMember();
        memberTreeMap.removeMember(1004);
        memberTreeMap.showAllMember();
    }
}
