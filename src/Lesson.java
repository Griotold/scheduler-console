import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson {

    static String[] names = new String [1000];
    static int [] numbers = new int [1000];

    static int n = 0;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        while(sc.hasNext()) {
            names[n] = sc.next();
            numbers[n] = sc.nextInt();
            n++;
        }
        sc.close();

        bubbleSort();

        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + names[i] + " ||| Number: " + numbers[i]);
        }
    }

    private static void bubbleSort() {
        for (int i = n - 1; i > 0; i--) {
            for(int j = 0; j < i; j++){
                if(names[j].compareTo(names[j+1]) > 0){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;

                    String tempStr = names[j];
                    names[j] = names[j+1];
                    names[j+1] = tempStr;
                }
            }
        }
    }
}
