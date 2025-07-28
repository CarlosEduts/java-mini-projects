package projects.library_system;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, int year, int issueNumber) {
        super(title, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "[Magazine] " + title + " - Issue " + issueNumber + " (" + year + ")";
    }
}
