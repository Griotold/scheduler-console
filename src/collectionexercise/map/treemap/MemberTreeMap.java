package collectionexercise.map.treemap;

import collectionexercise.Member;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        this.treeMap = new TreeMap<>();
    }

    /**
     * 회원 추가
     * */
    public void addMember(Member member) {
        treeMap.put(member.getMemberId(), member);
    }

    /**
     * 회원 삭제
     */
    public boolean removeMember(int memberId) {
        if (treeMap.containsKey(memberId)) {
            treeMap.remove(memberId);
            return true;
        }
        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }

    /**
     * 전체 회원 출력
     */
    public void showAllMember() {
        Iterator<Integer> it = treeMap.keySet().iterator();
        while(it.hasNext()) {
            Integer key = it.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
