package collectionexercise.map.hashmap;

import collectionexercise.Member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        this.hashMap = new HashMap<>();
    }

    /**
     * 회원 추가
     */
    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);
    }

    /**
     * 회원 삭제
     */
    public boolean removeMember(int memberId) {
        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }
        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }

    /**
     * 전체 회원 출력
     */
    public void showAllMember() {
        Iterator<Integer> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
