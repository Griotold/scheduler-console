package jungsuk.ch6;

import java.util.Arrays;

public class Exercise6_20 {
    static int max(int[] arr) {
        if(arr == null || arr.length == 0) {
            return -99999;
        }
        int answer = 0;
        for(int i = 0; i < arr.length; i++) {
            answer = Math.max(arr[i], answer);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println("최댓값: " + max(data));
        System.out.println("최댓값: " + max(null));
        System.out.println("최댓값: " + max(new int[] {}));
    }
}
