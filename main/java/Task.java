public class Task {
    private String title;
    private String description;
    private String dueDate;
    private boolean completed;

    public Task(String title, String description, String dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = false;
    }

    // Getters and setters

    public String toString() {
        return "Title: " + title + "\n" +
               "Description: " + description + "\n" +
               "Due Date: " + dueDate + "\n" +
               "Status: " + (completed ? "Completed" : "Not Completed");
    }
}
