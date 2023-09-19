package collectionexercise.arraylist;

import collectionexercise.Member;

import java.util.ArrayList;
import java.util.Iterator;

/***
 * ArrayList를 활용한 회원관리 프로그램
 */

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        this.arrayList = new ArrayList<Member>();
    }

    /**
     * 회원 추가
     * */
    public void addMember(Member member) {
        arrayList.add(member);
    }

    /**
     * 회원 삭제
     * */
    public boolean removeMember(int memberId) {
        // 전체 회원을 가져와 매개변수와 일치하는 회원 삭제
        for(int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                arrayList.remove(i);
                return true;
            }
        }
        // 그런 회원이 없으면 false 리턴
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    /**
     * 회원 삭제 : Iterator로 리팩토링
     */
    public boolean removeMemberV2(int memberId) {
        Iterator<Member> it = arrayList.iterator();
        while (it.hasNext()) {
            Member member = it.next();
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    /**
     * 전체 회원 출력
     * */
    public void showAllMember() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }

    /**
     * 회원 추가 : 특정 위치에 회원 추가
     */
    public void insertMember(Member member, int index) {
        arrayList.add(index, member);
    }
}
