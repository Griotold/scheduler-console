import event.Event;
import event.OneDayEvent;
import util.MyDate;

import java.util.Scanner;


public class Scheduler {

    public Event[] events = new Event[100];
    public int n = 0;
    private Scanner kb;
    public void processCommand() {

        kb = new Scanner(System.in);
        while(true) {
            System.out.print("$ ");
            String command = kb.next();
            if (command.equals("addevent")) {
                String type = kb.next();
                if (type.equalsIgnoreCase("oneday")) {
                    handleAddOneDayEvent();
                } else if (type.equalsIgnoreCase("duration")) {
                    handleAddDurationEvent();
                } else if (type.equalsIgnoreCase("deadline")) {
                    handleAddDeadlineEvent();
                }
            } else if (command.equals("list")) {

            } else if (command.equals("show")) {

            } else if (command.equals("exit")) {
                break;
            }
        }
        kb.close();
    }

    private void handleAddOneDayEvent() {
        System.out.print("   when: ");
        String dateString = kb.next();

        System.out.print("   title: ");
        String title = kb.next();

        MyDate date = customParseDateString(dateString);

        OneDayEvent oneDayEvent = new OneDayEvent(title, date);

        System.out.println(oneDayEvent);
        events[n++] = oneDayEvent;
    }

    private MyDate customParseDateString(String dateString) {
        String[] tokens = dateString.split("/");

        int year = Integer.parseInt(tokens[0]);
        int month = Integer.parseInt(tokens[1]);
        int day = Integer.parseInt(tokens[2]);

        return new MyDate(year, month, day);
    }

    private void handleAddDurationEvent() {

    }

    private void handleAddDeadlineEvent() {

    }

    public static void main(String[] args) {
        Scheduler app = new Scheduler();
        app.processCommand();
    }
}