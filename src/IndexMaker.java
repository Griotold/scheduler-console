import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class IndexMaker {

    static String [] words = new String[100000];
    static int [] count = new int [100000];
    static int n = 0;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while( true ) {

            System.out.print("$ ");
            String command = kb.next();
            if (command.equals("read")) {
                String fileName = kb.next();
                makeIndex( fileName );
            } else if (command.equals("find")) {

            } else if (command.equals("saveas")) {

            } else if (command.equals("exit"))
                break;

        }
        kb.close();

        for (int i = 0; i < n; i++) {
            System.out.println(words[i] + " " + count[i]);

        }
    }

    private static void makeIndex(String fileName) {

        try {
            Scanner inputFile = new Scanner(new File(fileName));
            while(inputFile.hasNext()) {
                String str = inputFile.next();
                addWord( str );
            }

            inputFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file");
            return;
        }


    }

    private static void addWord(String str) {
        int index = findWord( str ); // returns -1 if not found
        if (index != -1) {
            count[index]++;
        } else {
            words[n] = str;
            count[n] = 1;
            n++;
        }
    }

    private static int findWord(String str) {
        for (int i = 0; i < n; i++){
            if (words[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }
}
