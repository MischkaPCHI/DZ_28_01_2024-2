public class Task {
    private int id;
    private static int idCounter = 1;
    private String title;
    private int days;
    private  Programmer performer;

    public Task(String title, int days, Programmer performer) {
        this.id = idCounter++;
        this.title = title;
        this.days = days;
        this.performer = performer;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getDays() {
        return days;
    }

    public Programmer getPerformer() {
        return performer;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", days=" + days +
                ", performer=" + performer +
                '}';
    }
}
