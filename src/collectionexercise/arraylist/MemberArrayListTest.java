package collectionexercise.arraylist;

import collectionexercise.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서원");
        Member memberHong = new Member(1004, "홍길동");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberSon);
        memberArrayList.addMember(memberPark);
        memberArrayList.addMember(memberHong);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberHong.getMemberId());
        memberArrayList.removeMemberV2(memberLee.getMemberId());
        memberArrayList.showAllMember();

        Member memberJo = new Member(1005, "조해성");
        memberArrayList.insertMember(memberJo, 1);
        memberArrayList.showAllMember();
    }
}
