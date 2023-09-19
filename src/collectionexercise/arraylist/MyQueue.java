package collectionexercise.arraylist;

import java.util.ArrayList;

public class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<>();

    /**
     * 추가
     */
    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    /**
     * 삭제
     */
    public String deQueue() {
        int len = arrayQueue.size();
        if (len == 0) {
            System.out.println("큐가 비었습니다.");
            return null;
        }
        return arrayQueue.remove(0);
    }
}
