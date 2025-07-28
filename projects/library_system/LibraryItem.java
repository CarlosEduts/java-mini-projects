package projects.library_system;

public abstract class LibraryItem {
    protected String title;
    protected int year;
    protected boolean available;

    public LibraryItem(String title, int year) {
        this.title = title;
        this.year = year;
        this.available = true;
    }

    public void borrow() {
        if (!available) {
            System.out.println(title + " não disponível no momento :(");
        } else {
            available = false;
            System.out.println("Livro " + title + " pego com sucesso, boa leitura!");
        }
    }

    public void returnItem() {
        if (available) {
            System.out.println("O livro ja está na prateleira!");
        } else {
            available = true;
            System.out.println("Obrigado por devolver!");
        }
    }

    @Override
    public abstract String toString();
}
