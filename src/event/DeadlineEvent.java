package event;

import util.MyDate;

public class DeadlineEvent extends Event{

    public MyDate deadline;

    public DeadlineEvent(String title, MyDate deadline) {
        super(title);
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "DeadlineEvent{" +
                "title='" + title + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
