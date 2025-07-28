package projects.library_system;

public class Main {
    public static void main(String[] args) {
        LibraryItem book = new Book("1984", 1949, "George Orwell");
        LibraryItem magazine = new Magazine("National Geographic", 2023, 220);

        System.out.println(book);
        System.out.println(magazine);

        book.borrow();
        magazine.borrow();

        book.returnItem();
        magazine.returnItem();
    }
}
