package jungsuk.ch6;

import java.util.Arrays;


public class Exercise6_17 {
    // shuffle
    private static int[] shuffle(int[] original) {
        for(int i = 0; i < original.length; i++) {
            int j = (int) (Math.random() * original.length);

            int tmp = original[i];
            original[i] = original[j];
            original[j] = tmp;
        }
        return original;
    }
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(Arrays.toString(original));
    }


}
