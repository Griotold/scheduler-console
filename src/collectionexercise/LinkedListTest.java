package collectionexercise;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();

        // 링크드 리스트에 요소 추가
        myList.add("A");
        myList.add("B");
        myList.add("C");

        // 리스트 전체 출력
        System.out.println(myList);

        // 삽입
        myList.add(1, "D");
        System.out.println(myList);

        // 맨 앞에 추가
        myList.addFirst("O");
        System.out.println(myList);

        // 맨뒤 삭제
        String removed = myList.removeLast();
        System.out.println(removed);
        System.out.println(myList);
    }
}
