package projects.todo_list;

public class Task {
    private String title;
    private String description;
    private boolean completed;

    public Task(String title, String description, boolean completed) {
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        char isCompleted = this.completed ? 'X' : ' ';
        return "[" + isCompleted + "] " + this.title + " - " + this.description;
    }
}
