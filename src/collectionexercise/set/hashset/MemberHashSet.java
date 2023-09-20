package collectionexercise.set.hashset;

import collectionexercise.Member;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet을 활용한 회원 관리 프로그램
 * */
public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        this.hashSet = new HashSet<>();
    }

    /**
     * 회원 추가
     * */
    public void addMember(Member member) {
        hashSet.add(member);
    }

    /**
     * 회원 삭제
     */
    public boolean removeMember(int memberId) {
        Iterator<Member> it = hashSet.iterator();

        while(it.hasNext()){
            Member member = it.next();
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                hashSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    /**
     * 전체 회원 조회
     */
    public void showAllMember() {
        for (Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
