package collectionexercise.set.treeset;

import collectionexercise.Member;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet을 활용한 회원 관리 프로그램 구현
 * 회원 정렬 기준은 회원 아이디 순
 * */
public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        this.treeSet = new TreeSet<>();
    }

    /**
     * 회원 추가
     */
    public void addMember(Member member) {
        treeSet.add(member);
    }

    /**
     * 회원 삭제
     */
    public boolean removeMember(int memberId) {
        Iterator<Member> it = treeSet.iterator();

        while(it.hasNext()){
            Member member = it.next();
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    /**
     * 전체 회원 출력
     */
    public void showAllMember() {
        for (Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println();

    }
}
