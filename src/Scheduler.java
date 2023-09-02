import event.Event;

import java.util.Scanner;

public class Scheduler {

    Event[] events = new Event[100];

    public void processCommand() {

        Scanner kb = new Scanner(System.in);
        while(true) {
            System.out.print("$");
            String command = kb.next();
            if (command.equals("addevent")) {

            } else if (command.equals("list")) {

            } else if (command.equals("show")) {

            } else if (command.equals("exit")) {
                break;
            }
        }
        kb.close();
    }
    public static void main(String[] args) {
        Scheduler app = new Scheduler();
        app.processCommand();
    }
}