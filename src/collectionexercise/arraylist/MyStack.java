package collectionexercise.arraylist;

import java.util.ArrayList;

/**
 * ArrayList로 Stack 구현
 * */
public class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<>();

    /**
     * 추가
     */
    public void push(String data) {
        arrayStack.add(data);
    }

    /**
     * 삭제
     */
    public String pop() {
        int len = arrayStack.size();
        if (len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }

        return arrayStack.remove(len - 1);
    }
}
