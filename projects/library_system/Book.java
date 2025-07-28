package projects.library_system;

public class Book extends LibraryItem {
    private String author;

    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    @Override
    public String toString() {
        return "[Book] " + this.title + " - " + this.author + " (" + this.year + " )";
    }
}
